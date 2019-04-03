package com.capgemini.dao;

import java.util.List;

import com.capgemini.bean.Account;
/**
 * 
 * @author DOLA SAI RAM
 *
 */
public interface BankDaoInterface {
	
	public String addAccount(Account a);
	public String withDraw(Long accountId, Double amount);
	public String fundTransfer(Long accountId1, Long accountId2, Double amount);
	public void printTransaction(Long accountId);
	public Double showBalance(Long accountId);
	public String deposit(Long accountId, Double amount);
}
