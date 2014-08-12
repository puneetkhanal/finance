package com.finance.interfaces;

import java.util.List;

import com.finance.entities.Customer;
import com.finance.entities.Transaction;
import com.finance.reporting.IReportComputer;
import com.finance.ui.view.CRForm;

public interface IAbstractFactory {
	public IReportComputer getReportComputer();
	
	public Transaction getTransaction(IAccount account,double amount,String type);
	public Transaction createTransaction(IAccount account,double amount,String type);
	
	public Customer createCustomer(CRForm form, String customerType);
	public void createCustomerTemplate(CRForm form, String customerType,String accountType);
	
	public IAccount createAccount(CRForm form, ICustomer customer,String accountType);
	
	public List<IDataSet> getDataSet(ICustomerManager customerManager);
	
	
	public void setManagers(ICustomerManager customerManager,IAccountManager accountManager,ITransactionManager transactionManager);
	

}
