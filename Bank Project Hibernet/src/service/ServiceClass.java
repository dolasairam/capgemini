package service;

import java.util.List;

import bean.Account;
import bean.TransactionDetails;
import dao.DaoClass;
import dao.DaoInterface;

public class ServiceClass implements ServiceInterface {

	DaoClass dao;
	@Override
	public String createAccount(Account a) {
			if(a.getFirstName().length()>=3 && a.getLastName().length()>=3 && a.getFathersName().length()>=3 &&
					a.getMothersName().length()>=3)
			{
				dao=new DaoClass();
				dao.beginTransaction();
				String str=dao.createAccount(a);
				dao.commitTransaction();
				if(str.equalsIgnoreCase("created"))
				{
					Account acc=dao.showDetails(a.getLogin().getUserName());
					return acc.getFirstName()+" "+acc.getAccountId()+" "+acc.getLogin().getUserName();
				}
				else
				{
					return "invalid";
				}
				
			}
			return "invalid";
	}

	@Override
	public String deposit(Double amount, String username) {
		if(amount>0)
		{
			dao=new DaoClass();
			dao.beginTransaction();
			String str=dao.deposit(amount, username);
			dao.commitTransaction();
			return str;
		}
		else
		{
			return "Please enter a valid amount";
		}
		
	}

	@Override
	public String withdraw(Double amount, String username) {
		if(amount>0)
		{
			dao=new DaoClass();
			dao.beginTransaction();
			String str=dao.withdraw(amount, username);
			dao.commitTransaction();
			return str;
		}
		else
		{
			return "Please enter a valid amount";
		}
	}

	@Override
	public String fundTransfer(Long accountId, Double amount, String username) {
		if(amount>0)
		{
			dao=new DaoClass();
			dao.beginTransaction();
			String str=dao.fundTransfer(accountId, amount, username);
			dao.commitTransaction();
			return str;
		}
		else
		{
			return "Please enter a valid amount";
		}
	}

	@Override
	public List<TransactionDetails> transactions(String username) {
		dao= new DaoClass();
		List li=dao.transactions(username);
		return li;
	}
	
	public Boolean validateUserName(String username)
	{
		dao= new DaoClass();
		return dao.validateUserName(username);
	}
	
	public boolean checkAccount(String username, String password)
	{
		dao= new DaoClass();
		return dao.checkAccount(username,password);
	}
	
	public Double checkBalance(String username)
	{
		dao=new DaoClass();
		return dao.checkBalance(username);
	}
	

}
