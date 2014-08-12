package com.finance.entities;

import com.finance.interfaces.ICustomer;

public class Account{
	
	private TransactionManager transactionManager;
	private int accountNumber;
	private double currentBalance;
	private ICustomer customer;
	
	
	public Account(int acc_no, ICustomer customer) {
		super();
		this.accountNumber = acc_no;
		this.customer = customer;
		transactionManager = new TransactionManager();
	}
	
	public void addBalance(double amount){
		currentBalance+=amount;
	}
	

	public TransactionManager getTransactionManager() {
		return transactionManager;
	}
	public void executeTransaction(Transaction transaction){
		transactionManager.addTransaction(transaction);
	}
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	
	public double getCurrentBalance() {
		return currentBalance;
	}
	
	public ICustomer getCustomer() {
		return customer;
	}
	
	public String generateReport(){
		return null;
	}
	
	public void notifyCustomer(String transactionDetails){
		
	}

}
