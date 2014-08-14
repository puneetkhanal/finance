package framework.interfaces;

import java.util.List;


import framework.entities.Address;
import framework.entities.Transaction;
import framework.reporting.Report;

public interface ICustomer {
	public boolean addAccount(IAccount account);
	
	public boolean removeAccount(IAccount account);
	
	public boolean sendEmail(Transaction transaction,IAccount account);
	
	public boolean checkEmailSendingCondition(Transaction transaction);
	
	public List<IAccount> getAllAccount();
	
	public Address getAddress();
	
	public String getName();
	
	public String getEmail();
	
	public String getType();
	
	public Report getReport();
	
}
