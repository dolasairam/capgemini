package com.capgemini.dao;

import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.omg.CORBA.Current;

import com.capgemini.bean.Account;
import com.capgemini.bean.Transaction;
import com.capgemini.utility.AccountUtility;
/**
 * 
 * @author DOLA SAI RAM
 *
 */
public class BankDaoClass implements BankDaoInterface {
	static ArrayList<Account> account = new ArrayList<Account>();
	static List<Transaction> transaction = new ArrayList<Transaction>();
	Transaction t = new Transaction();
	Connection com = AccountUtility.getConnection();
	AccountUtility accountUtil = new AccountUtility();
	@Override
	public String addAccount(Account a) {
		try {
			PreparedStatement ps = com.prepareStatement("insert into account values(?, ?, ?,"
												+ "	?, account_id.nextval, ?, ?, ?)");
			ps.setString(1, a.getFirstName());
			ps.setString(2, a.getLastName());
			ps.setString(3, a.getFathersName());
			ps.setString(4, a.getMothersName());
//			ps.setLong(5, a.getAccountId());
			ps.setString(5, a.getPassword());
			ps.setString(6, a.getAddress());
			ps.setDouble(7, a.getBalance());
		
			int count = ps.executeUpdate();
			if(count>0)
			{
				PreparedStatement ps1 = com.prepareStatement("Select accountid from account where ((firstname = ? and lastName = ?) and FATHERSNAME = ?)");
				ps1.setString(1, a.getFirstName());
				ps1.setString(2,a.getLastName());
				ps1.setString(3, a.getFathersName());
				ResultSet rs= ps1.executeQuery();
				rs.next();
				String accountId=rs.getString(1);
				accountId = "account Id"+accountId;
				com.commit();
				return accountId;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Not added";
	}
	
	public ResultSet validate(Long accountId,String password)
	{
		ResultSet rs=null;
		try {
			PreparedStatement ps = com.prepareStatement("Select accountid, password from account where (ACCOUNTID = ? and PASSWORD = ?)");
			ps.setLong(1, accountId);
			ps.setString(2, password);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public String deposit(Long accountId, Double amount) {
		Double updateAmount =0.0;
		try {
			if(amount>0)
			{
				PreparedStatement ps = com.prepareStatement("Select BALANCE from account where ACCOUNTID = ?");
				ps.setLong(1, accountId);
				ResultSet rs =ps.executeQuery();
				rs.next();
				Double balance = rs.getDouble(1);
				balance=balance+amount;
				PreparedStatement ps1 = com.prepareStatement("update account set balance = ? where accountid = ?");
				ps1.setDouble(1, balance);
				ps1.setLong(2, accountId);
				int count = ps1.executeUpdate();
				if(count==1)
				{
					String transactionUpdate="deposit +"+ amount;
					PreparedStatement ts = com.prepareStatement("insert into transactions values (?,?,?)");
					ts.setLong(1, accountId);
					ts.setString(2,transactionUpdate);
					Timestamp time = new Timestamp(System.currentTimeMillis());
	 				ts.setTimestamp(3, time);
	 				int t = ts.executeUpdate();
	 				return "success";
				}
				else
				{
					return "invalid";
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "invalid";
	}

	@Override
	public String withDraw(Long accountId, Double amount) {
		Double updateAmount =0.0;
		try {
			PreparedStatement ps = com.prepareStatement("Select BALANCE from account where ACCOUNTID = ?");
			ps.setLong(1, accountId);
			ResultSet rs =ps.executeQuery();
			rs.next();
			Double balance = rs.getDouble(1);
			if(balance<amount)
			{
				return "insufficient";
			}
			updateAmount = balance - amount;
			PreparedStatement ps1 = com.prepareStatement("update account set balance = ? where accountid = ?");
			ps1.setDouble(1, updateAmount);
			ps1.setLong(2, accountId);
			int count = ps1.executeUpdate();
			if(count==1)
			{
				String transactionUpdate="withdraw -"+amount;
				PreparedStatement ts = com.prepareStatement("insert into transactions values (?,?,?)");
				ts.setLong(1, accountId);
				ts.setString(2,transactionUpdate);
				Timestamp time = new Timestamp(System.currentTimeMillis());
 				ts.setTimestamp(3, time);
 				int t = ts.executeUpdate();
				return "success";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Insufficient amount";
	}

	@Override
	public String fundTransfer(Long accountId1, Long accountId2, Double amount) {
		double update1=0.0;
		double update2=0.0;
		PreparedStatement ps;
		synchronized(this) {
		try {
			ps = com.prepareStatement("Select BALANCE from account where ACCOUNTID = ?");
			ps.setLong(1, accountId1);
			ResultSet rs =ps.executeQuery();
			rs.next();
			Double balance = rs.getDouble(1);
			if(balance>=amount)
			{
				update1 = balance-amount;
				PreparedStatement ps1 = com.prepareStatement("update account set balance = ? where accountid = ?");
				ps1.setDouble(1, update1);
				ps1.setLong(2, accountId1);
				PreparedStatement ps2=com.prepareStatement("Select BALANCE from account where ACCOUNTID = ?");
				ps2.setLong(1, accountId2);
				rs =ps2.executeQuery();
				if(rs.next()) {
					Double balance1 = rs.getDouble(1);
					update2 = balance1 + amount;
					PreparedStatement ps3 = com.prepareStatement("update account set balance = ? where accountid = ?");
					ps3.setDouble(1, update2);
					ps3.setLong(2, accountId2);
					int count = ps3.executeUpdate();
					int c=ps1.executeUpdate();
					if(count==1 && c==1)
					{
						String transactionUpdate="Transfer To " + accountId2+ " -" + amount;
						PreparedStatement ts = com.prepareStatement("insert into transactions values (?,?,?)");
						ts.setLong(1, accountId1);
						ts.setString(2,transactionUpdate);
						Timestamp time = new Timestamp(System.currentTimeMillis());
		 				ts.setTimestamp(3, time);
		 				int t = ts.executeUpdate();
		 				transactionUpdate="Transfer From " + accountId1 +" +" + amount;
						PreparedStatement ts1 = com.prepareStatement("insert into transactions values (?,?,?)");
						ts1.setLong(1, accountId2);
						ts1.setString(2,transactionUpdate);
		 				ts1.setTimestamp(3, time);
		 				int t1 = ts1.executeUpdate();
						return "success";
					}
					else
					{
						return "failed";
					}
					}
				
				else
				{
					return "account Id not found";
				}
			}
			else
			{
				return "insufficient funds";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "failed";
		}
		}
	}

	@Override
	public ResultSet printTransaction(Long accountId) {
		ResultSet rs=null;
			try {
				PreparedStatement ts = com.prepareStatement("Select accountId, TYPE, TIME from Transactions where accountId =?");
				ts.setLong(1, accountId);
				rs =  ts.executeQuery();
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return rs;
	}
	
	public Boolean uniqueIds(Long id,String password)
	{
		ResultSet rs=validate(id, password);
		try {
			rs.next();
			Long accountId = rs.getLong(1);
			String pass = rs.getString(2);
			if(accountId.equals(id) && pass.equals(password))
			{
				return true;
			}
			else
			{
				return false;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public ResultSet showBalance(Long accountId) {
		ResultSet rs=null;
		try {
			PreparedStatement ps = com.prepareStatement("Select BALANCE from account where ACCOUNTID = ?");
			ps.setLong(1, accountId);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
		
	}
	
	public boolean checkAccount(Long id, String password)
	{
		try {
			PreparedStatement ps = com.prepareStatement("select accountId from account where accountId=? and password = ?");
			ps.setLong(1, id);
			ps.setString(2,password);
			ResultSet rs = ps.executeQuery();
			int count=0;
			while(rs.next())
			{
				count++;
			}
			if(count==0)
			{
				return false;
			}
			else
			{
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}


}
