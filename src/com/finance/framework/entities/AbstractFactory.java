package com.finance.framework.entities;

import java.util.List;

import com.finance.framework.intefaces.IAbstractFactory;
import com.finance.framework.intefaces.IAccount;
import com.finance.framework.intefaces.IAccountManager;
import com.finance.framework.intefaces.ICustomer;
import com.finance.framework.intefaces.ICustomerManager;
import com.finance.framework.intefaces.ITransactionManager;
import com.finance.view.CRModel;



public abstract class AbstractFactory implements IAbstractFactory {
	private ICustomerManager customerManager;
	private IAccountManager accountManager;
	private ITransactionManager transactionManager;
	
	@Override
	 public final void createCustomerTemplate(CRModel form, String customerType,
			String accountType) {
		
		ICustomer customer = createCustomer(form, customerType);
		IAccount account = createAccount(form, customer, accountType);
		account.setManagers(accountManager, transactionManager);
		customer.addAccount(account);
		customerManager.submitCustomer(customer);
		accountManager.addAccount(account);
	}
	
	 @Override
	public final void setManagers(ICustomerManager customerManager,IAccountManager accountManager,
			 ITransactionManager transactionManage){
		 
		this.customerManager = customerManager;
		this.accountManager = accountManager;
		this.transactionManager = transactionManage;
	}
	
	@Override
	public final Transaction createTransaction(IAccount account, double amount,
			String type) {
		
		Transaction transaction = getTransaction(account, amount, type);
		transactionManager.addTransactionTemplate(transaction);
		return transaction;
	}
	
	@Override
	public void createInterestTransactions(List<IAccount> accountList) {
		for(IAccount account: accountList){
			double interest = account.computeInterest();
			Transaction transaction = getTransaction(account, interest,"addinterest");
			transactionManager.addTransactionTemplate(transaction);
		}
		
	}

}
