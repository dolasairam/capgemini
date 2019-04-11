package com.capgemini.dao;

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
	static
	{
		account.add(new Account("Sairam", "dola", "joga rao", "Latha", 123456L, "Sairam", "Vishakaptnam", 2000.0));
		transaction.add(new Transaction(123456L, "Deposit", new Date(), 2000.0));
		account.add(new Account("Sairam", "dola", "joga rao", "Latha", 123459L, "Sairam", "Vishakaptnam", 20000.0));
		transaction.add(new Transaction(123459L, "Deposit", new Date(), 2000.0));
	}

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
	
	public boolean validate(Long accountId,String password)
	{
		boolean flag=true;
		try {
			PreparedStatement ps = com.prepareStatement("Select accountid from account where (ACCOUNTID = ? and PASSWORD = ?)");
			ps.setLong(1, accountId);
			ps.setString(2, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public String deposit(Long accountId, Double amount) {
		Double updateAmount =0.0;
		for(Account a:account)
		{
			if(a.getAccountId().equals(accountId) && amount>0)
			{
//					Transaction t = new Transaction();
					t = new Transaction();
					t.setAccountId(accountId);
					t.setAmount(amount);
					t.setD(new Date());
					t.setType("Deposit");
					transaction.add(t);
				updateAmount =a.getBalance()+amount;
				a.setBalance(updateAmount);
				return "success";
			}
		}
		return "invalid amount";
		
	}

	@Override
	public String withDraw(Long accountId, Double amount) {
		
		Double updateAmount =0.0;
		for(Account a:account)
		{
			if(a.getAccountId().equals(accountId));
			{
				if(a.getBalance()>=amount){
				{
//					Transaction t = new Transaction();
					t = new Transaction();
					t.setAccountId(accountId);
					t.setAmount(amount);
					t.setD(new Date());
					t.setType("Withdraw");
					transaction.add(t);
					updateAmount = a.getBalance()-amount;
					a.setBalance(updateAmount);
					return "success";
				}
				
			}
			}
		}
		return "Insufficient amount";
	}

	@Override
	public String fundTransfer(Long accountId1, Long accountId2, Double amount) {
		synchronized(this)
		{
//				Transaction 
			t = new Transaction();
			t.setAccountId(accountId1);
			t.setAmount(amount);
			t.setD(new Date());
			t.setType("Fund Transfer Deposit");
			transaction.add(t);
			t = new Transaction();
			t.setAccountId(accountId2);
			t.setAmount(amount);
			t.setD(new Date());
			t.setType("Fund Transfer Deposit");
			transaction.add(t);
			String status=withDraw(accountId1, amount);
			transaction.remove(transaction.size()-1);
			if(status.equals("success"))
			{
				deposit(accountId2, amount);
				transaction.remove(transaction.size()-1);
				return "success";
			}
			else
			{
				return "Invalid Amount";
			}
		}
	}

	@Override
	public void printTransaction(Long accountId) {
//		List<Transaction> list=new ArrayList<Transaction>();
//		list=transaction.stream().filter((e)->e.getAccountId().equals(accountId)).collect(Collectors.toList());
//		return list;
		
		for(Transaction t: transaction)
		{
			//if(t.getAccountId().equals(accountId))
			{
				System.out.println(t);
			}
		}
		
	}
	
	public Boolean uniqueIds(Long id)
	{
		List<Long> uniqueId = account.stream().map((e)->e.getAccountId()).collect(Collectors.toList());
		if(uniqueId.contains(id))
		{
			return true;
		}
		return false;
	}
	
	public Account listing(Long id)
	{
		for(Account a:account)
		{
			if(a.getAccountId().equals(id));
			{
				return a;
			}
		}
		return null;
	}
	public boolean checkAccount(Long id, String password)
	{
		for(Account a:account)
		{
			if(a.getAccountId().equals(id) && a.getPassword().equals(password))
				return true;
		}
		return false;
	}

	@Override
	public Double showBalance(Long accountId) {
		for(Account a:account)
		{
			if(a.getAccountId().equals(accountId))
					return a.getBalance();
		}
		return null;
	}


}
