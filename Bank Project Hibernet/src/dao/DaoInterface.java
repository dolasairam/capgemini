package dao;

import java.util.List;

import bean.Account;
import bean.TransactionDetails;

public interface DaoInterface {
	
	public String createAccount(Account account);
	
	public String deposit(Double amount, String username);
	
	public String withdraw(Double amount, String username);
	
	public String fundTransfer(Long accountId, Double amount, String username);
	
	public List<TransactionDetails> transactions(String username);

}
