package com.capgemini.service;

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
//		return "not Added";
	}
	
	public boolean validate(Long accountId)
	{
		return false;
	}
	
	@Override
	public String deposit(Long accountId, Double amount) {
		// TODO Auto-generated method stub
		if(amount>0)
		{
			bdc=new BankDaoClass();
			bdc.deposit(accountId, amount);
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
		return bdc.showBalance(accountId);
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
	public void printTransaction(Long accountId) {
		// TODO Auto-generated method stub
//		bdc=new BankDaoClass();
		bdc.printTransaction(accountId);
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
		

	public Account listing(Long id)
	{
		bdc =new BankDaoClass();
		return bdc.listing(id);
	}
}
