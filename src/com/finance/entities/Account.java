package com.finance.entities;

import java.util.HashMap;
import java.util.Map;

import com.demoapp.entities.AccountManager;

import com.finance.interfaces.ICustomer;
import com.finance.reporting.Report;


public class Account{
	
	private static int accountNumberGenerator =123456;
	private int accountNumber;
	private double currentBalance;
	private ICustomer customer;
	private AccountManager accountManager;
	
	public Account(int acc_no, ICustomer customer) {
		super();
		this.accountNumber = acc_no;
		this.customer = customer;
		
	}
	public Account(ICustomer customer){
		accountNumber = accountNumberGenerator;
		accountNumberGenerator++;
	}
	
	public void setAccountManger(AccountManager accountManger){
		this.accountManager = accountManger;
		//accountManger.addAccount(this);
	}
	
	public void addBalance(double amount){
		currentBalance+=amount;
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
