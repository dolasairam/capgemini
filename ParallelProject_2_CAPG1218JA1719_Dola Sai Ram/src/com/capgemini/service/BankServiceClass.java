package com.capgemini.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.capgemini.bean.Account;
import com.capgemini.bean.Transaction;
import com.capgemini.dao.BankDaoClass;
import com.capgemini.dao.BankDaoInterface;
/***
 * 
 * @author DOLA SAI RAM
 *
 */
public class BankServiceClass implements BankServiceInterface {
	BankDaoClass bdc;
	
	@Override
	public String addAccount(Account a) {
		if(a.getFirstName().length()>=3 && a.getLastName().length()>=3 && a.getFathersName().length()>=3 &&
				a.getMothersName().length()>=3 && a.getAddress().length()>=6)
		{
			bdc = new BankDaoClass();
			Account list = new Account();
			String str=bdc.addAccount(a);
			return str;
		}
		else
		{
			return "invalid";
		}
	}
	
	public boolean validate(Long accountId,String password)
	{
		bdc = new BankDaoClass();
		ResultSet rs = bdc.validate(accountId, password);
		if(rs==null)
		{
			return false;
		}
		return true;
	}
	
	@Override
	public String deposit(Long accountId, Double amount) {
		if(amount>0)
		{
			bdc=new BankDaoClass();
			bdc.deposit(accountId, amount);
		}
		else
		{
			return "invalid";
		}
		
		return "success";
	}

	@Override
	public String withDraw(Long accountId, Double amount) { 
		if(amount>0)
		{
			bdc=new BankDaoClass();
			return bdc.withDraw(accountId, amount);
		}
		return "Invalid Amount";
	}

	@Override
	public Double showBalance(Long accountId) {
		bdc=new BankDaoClass();
		ResultSet rs = bdc.showBalance(accountId);
		double balance=0.0;
		try {
			rs.next();
			balance = rs.getDouble(1);
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return balance;
		
	}

	@Override
	public String fundTransfer(Long accountId1, Long accountId2, Double amount) {
		bdc = new BankDaoClass();
		if(amount>0)
		{
			return bdc.fundTransfer(accountId1, accountId2, amount);
		}
		return "Invalid amount";
	}

	@Override
	public ResultSet printTransaction(Long accountId) {
		ResultSet rs = bdc.printTransaction(accountId);
		return rs;
	}

	public boolean validate(String password, String rePassword) {
		if(password.equals(rePassword))
		{
			return true;
		}
		return false;
		
	}
	
	public boolean checkAccount(Long id, String password)
	{
		return bdc.checkAccount(id, password);
	}
		
	
	public boolean checkUniqueId(long id)
	{
		return true;
	}
}
