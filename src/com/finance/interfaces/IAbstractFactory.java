package com.finance.interfaces;

import java.util.List;

import com.finance.entities.Customer;
import com.finance.entities.Transaction;
import com.finance.reporting.IReportComputer;
import com.finance.view.defaultview.CRModel;

public interface IAbstractFactory {
	public IReportComputer getReportComputer();
	
	public Transaction getTransaction(IAccount account,double amount,String type);
	public Transaction createTransaction(IAccount account,double amount,String type);
	
	public Customer createCustomer(CRModel form, String customerType);
	public void createCustomerTemplate(CRModel form, String customerType,String accountType);
	
	public IAccount createAccount(CRModel form, ICustomer customer,String accountType);
	
	public List<IDataSet> getDataSet(ICustomerManager customerManager);
	
	
	public void setManagers(ICustomerManager customerManager,IAccountManager accountManager,ITransactionManager transactionManager);
	public void createInterestTransactions(List<IAccount> account);

}
