package com.finance.framework.intefaces;






import com.finance.framework.entities.Transaction;
import com.finance.framework.reporting.Report;


public interface IAccount {
	public void setManagers(IAccountManager accountManger,ITransactionManager transactionManager);
	
	public void addBalance(double amount);
	public int getAccountNumber(); 
	public double getCurrentBalance();
	public ICustomer getCustomer();
	public void notifyCustomer(Transaction transaction);
	public void setChanged();
	public  String getType();
	public Report getReport();
	public String getExpiryDate();
	
	public double computeInterest();
	
}
