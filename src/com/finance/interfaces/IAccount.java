package com.finance.interfaces;





import com.finance.entities.Transaction;
import com.finance.reporting.Report;

public interface IAccount {
	public void setAccountManager(IAccountManager accountManger);
	
	public void addBalance(double amount);
	public int getAccountNumber(); 
	public double getCurrentBalance();
	public ICustomer getCustomer();
	
	public double getInterestRate();
	public void notifyCustomer(Transaction transaction);
	public void setChanged();
	public  String getType();
	public Report getReport();
	
	public double computeInterest();
	
}
