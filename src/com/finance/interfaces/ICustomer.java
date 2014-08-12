package com.finance.interfaces;

import java.util.List;

import com.finance.entities.Account;
import com.finance.entities.Address;
import com.finance.entities.Transaction;
import com.finance.reporting.Report;

public interface ICustomer {
	public boolean addAccount(Account account);
	
	public boolean removeAccount(Account account);
	
	public boolean sendEmail(Transaction transaction,Account account);
	
	public boolean checkEmailSendingCondition(Transaction transaction);
	
	public List<Account> getAllAccount();
	
	public Address getAddress();
	
	public String getName();
	
	public String getEmail();
	
	public String getType();
	
	public Report getReport();
	
}
