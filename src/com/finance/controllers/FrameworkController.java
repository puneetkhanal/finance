package com.finance.controllers;

import java.util.List;

import com.demoapp.entities.AccountManager;
import com.demoapp.entities.CustomerManager;
import com.finance.entities.Account;
import com.finance.entities.Customer;
import com.finance.entities.IDataSet;
import com.finance.entities.Transaction;
import com.finance.interfaces.IAbstractFactory;
import com.finance.interfaces.IAccountManager;
import com.finance.interfaces.ICustomerManager;
import com.finance.interfaces.ITransactionManager;
import com.finance.reporting.Report;
import com.finance.ui.controller.UIController;
import com.finance.ui.view.CRForm;

public class FrameworkController {
	private IAccountManager accountManger;
	private ICustomerManager customerManager;
	private ITransactionManager transactionManager;
	private IAbstractFactory abstractFactory;
	private UIController viewController;
	
	public FrameworkController(UIController uiController ) {
		abstractFactory = null; 
		this.viewController = uiController;
		viewController.setFrameWorkcontroller(this);
		
	}
	
	public void injectServiceProviders(ICustomerManager customerManager,IAccountManager accountManager, 
			ITransactionManager transactionManager,IAbstractFactory factory){
		abstractFactory = factory;
		this.customerManager = customerManager;
		this.accountManger = accountManager;
		this.transactionManager = transactionManager;
		
		if(abstractFactory!=null){
			abstractFactory.setManagers(customerManager, accountManager, transactionManager);
		}
		else
			System.out.println("Factory not Set!!! Please set inject the factory");
	}
	
	public void setUIController(UIController uiController){
		viewController = uiController;
	}
	
	public boolean executeTransaction(int accountNumber, double amount, String type){
		Account account = accountManger.findAccount(accountNumber);
		if(account!=null){
			if(abstractFactory!=null){
				Transaction transaction =abstractFactory.getTransaction(account, amount, type);
				//account.executeTransaction(transaction);
				return true;
			}
		}
		return false;
	}
	
	public boolean createCustomer(CRForm form, String customerType, String accountType ){
		abstractFactory.createCustomerTemplate(form, customerType, accountType);		
		return true;
	}
	
	public void dataSetChanged(){
		List<IDataSet> dataSetList = abstractFactory.getDataSet(customerManager);
		viewController.updateTable(dataSetList);
	}
	
	public Report getReport(){
		return null;
	}

}
