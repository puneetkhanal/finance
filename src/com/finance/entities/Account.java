package com.finance.entities;

import java.util.HashMap;
import java.util.Map;

import com.demoapp.entities.AccountManager;
import com.finance.interfaces.ICustomer;
import com.finance.reporting.Report;
import com.sun.org.apache.bcel.internal.generic.BALOAD;

public class Account{
	
	private TransactionManager transactionManager;
	private int accountNumber;
	private double currentBalance;
	private ICustomer customer;
	private AccountManager accountManager;
	
	public Account(int acc_no, ICustomer customer) {
		super();
		this.accountNumber = acc_no;
		this.customer = customer;
		transactionManager = new TransactionManager();
	}
	
	public void setAccountManger(AccountManager accountManger){
		this.accountManager = accountManger;
		//accountManger.addAccount(this);
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
	
	public void notifyCustomer(Transaction transaction){
		
	}
	
	public void setChanged(){
		accountManager.setChanged();
	}
	
	public  String getType(){
		return "default";
	}
	
	public Report getReport(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("Account Number", ""+getAccountNumber()+"");
		map.put("Current Balance",""+getCurrentBalance()+"");
		map.put("Account Type", getType());
		Report myReport = new Report(map);
		return myReport;
		
	}
}
