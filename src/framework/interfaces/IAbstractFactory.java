package framework.interfaces;

import java.util.List;


import finance.view.CRModel;
import framework.entities.Customer;
import framework.entities.Transaction;
import framework.reporting.IReportComputer;

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
