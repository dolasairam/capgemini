package com.capgemini.service;

import java.sql.ResultSet;
import java.util.List;

import com.capgemini.bean.Account;
import com.capgemini.bean.Transaction;
/**
 * 
 * @author DOLA SAI RAM
 *
 */
public interface BankServiceInterface {
	public String addAccount(Account a);
	public String deposit(Long accountId, Double amount);
	public String withDraw(Long accountId, Double amount);
	public Double showBalance(Long accountId);
	public String fundTransfer(Long accountId1, Long accountId2, Double amount);
	public ResultSet printTransaction(Long accountId);
	
}
