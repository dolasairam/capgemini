package dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import bean.Account;
import bean.LoginDetails;
import bean.TransactionDetails;
import util.GetConnection;

public class DaoClass implements DaoInterface {
	
	GetConnection gt = new GetConnection();
	EntityManager em = gt.getConnection();

	@Override
	public String createAccount(Account account) {
		em.persist(account);
		return "created";
	}

	@Override
	public String deposit(Double amount,String username) {
		Query q=em.createQuery("from Account where userName=:n");
		q.setParameter("n", username);
		Account acc = (Account)q.getSingleResult();
		Double currentBalance = acc.getAmount();
		if(amount>0)
		{
			currentBalance=currentBalance+amount;
			acc.setAmount(currentBalance);
			TransactionDetails td = new TransactionDetails(acc.getAccountId(),"deposit",amount);
			em.persist(acc);
			em.persist(td);
			System.out.println("committed");
		}
//		acc.setAmount(amount);
//		em.persist(acc);
		return null;
	}

	@Override
	public String withdraw(Double amount,String username) {
		Query q=em.createQuery("from Account where userName=:n");
		q.setParameter("n", username);
		Account acc = (Account)q.getSingleResult();
		Double currentBalance = acc.getAmount();
		if(currentBalance>0 && amount <= currentBalance)
		{
			currentBalance=currentBalance-amount;
			TransactionDetails td = new TransactionDetails(acc.getAccountId(),"Withdraw",amount);
			acc.setAmount(currentBalance);
			em.persist(acc);
			em.persist(td);
		}
		return null;
	}

	@Override
	public String fundTransfer(Long accountId, Double amount, String username) {
		Query q=em.createQuery("from Account where userName=:n");
		q.setParameter("n", username);
		Account acc = (Account)q.getSingleResult();
		Double currentBalance = acc.getAmount();
		TransactionDetails td;
		if(currentBalance>0 && amount <= currentBalance)
		{
			currentBalance=currentBalance-amount;
			 td = new TransactionDetails(acc.getAccountId(),"Transfer to"+accountId,amount);
			acc.setAmount(currentBalance);
		}
		else
		{
			return "insufficient funds";
		}
		try
		{
		Query q1=em.createQuery("from Account where accountId=:n");
		q1.setParameter("n", accountId);
		Account acc1=(Account)q1.getSingleResult();
		if((long)acc1.getAccountId()==accountId)
		{
			Double currentBalance1=acc.getAmount()+amount;
			acc1.setAmount(currentBalance1);
			em.persist(acc);
			em.persist(acc1);
			TransactionDetails td2 = new TransactionDetails(acc1.getAccountId(),"Transferd form"+acc.getAccountId(),amount);
			em.persist(td2);
			em.persist(td);
			return "Fund Transfered";
		}
		else
		{
			return "Invalid account no";
		}
		}
		catch(Exception e)
		{
			return "Invalid Account Number";
		}
	}

	@Override
	public List transactions(String username) {
		Query q1=em.createQuery("from Account where username=:n");
		q1.setParameter("n", username);
		Account acc1=(Account)q1.getSingleResult();
		Query q2 = em.createQuery("from TransactionDetails where accountId = :n");
		q2.setParameter("n", acc1.getAccountId());
		List<TransactionDetails> li = q2.getResultList();
		return li;
	}
	
	public void beginTransaction()
	{
		em.getTransaction().begin();
	}
	
	public void commitTransaction()
	{
		em.getTransaction().commit();
	}
	
	public Account showDetails(String username)
	{
		Query q=em.createQuery("from Account where userName=:n");
		q.setParameter("n", username);
		Account acc = (Account)q.getSingleResult();
		if(acc.getLogin().getUserName().equals(username))
		{
			return acc;
		}
		else
		{
			return null;
		}
	}
	
	public Double checkBalance(String username)
	{
		Query q=em.createQuery("from Account where userName=:n");
		q.setParameter("n", username);
		Account acc = (Account)q.getSingleResult();
		if(acc.getLogin().getUserName().equals(username))
		{
			
			return acc.getAmount();
		}
		else
		{
			return null;
		}
	}
	
	public Boolean validateUserName(String username)
	{
		Query q=em.createQuery("from Account where userName=:n");
		q.setParameter("n", username);
		try
		{
		Account acc = (Account)q.getSingleResult();
		if(acc.getLogin().getUserName().equals(username))
		{
			System.out.println("Dao 161");
			return true;
		}
		else
		{
			System.out.println("Dao 166");
			return false;
		}
		}
		catch(Exception e)
		{
			System.out.println("Dao 171");
			return false;
		}
	}
	public boolean checkAccount(String username, String password)
	{
		Query q=em.createQuery("from LoginDetails where userName=:n");
		q.setParameter("n", username);
		LoginDetails login = (LoginDetails)q.getSingleResult();
		if(login.getPassword().equals(password) && login.getUserName().equals(username))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
