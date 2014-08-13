package com.finance.entities;

import java.util.List;

import com.finance.interfaces.IAbstractFactory;
import com.finance.interfaces.IAccount;
import com.finance.interfaces.IAccountManager;
import com.finance.interfaces.ICustomer;
import com.finance.interfaces.ICustomerManager;
import com.finance.interfaces.ITransactionManager;
import com.finance.ui.view.CRModel;

public abstract class AbstractFactory implements IAbstractFactory {
	private ICustomerManager customerManager;
	private IAccountManager accountManager;
	private ITransactionManager transactionManager;
	
	@Override
	 public final void createCustomerTemplate(CRModel form, String customerType,
			String accountType) {
		
		ICustomer customer = createCustomer(form, customerType);
		IAccount account = createAccount(form, customer, accountType);
		customer.addAccount(account);
		customerManager.submitCustomer(customer);
		accountManager.addAccount(account);
	}
	
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
