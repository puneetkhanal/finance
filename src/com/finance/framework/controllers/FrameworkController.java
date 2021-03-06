package com.finance.framework.controllers;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

import com.finance.framework.intefaces.IAbstractFactory;
import com.finance.framework.intefaces.IAccount;
import com.finance.framework.intefaces.IAccountManager;
import com.finance.framework.intefaces.ICustomerManager;
import com.finance.framework.intefaces.IDataSet;
import com.finance.framework.intefaces.ITransactionManager;
import com.finance.framework.reporting.Report;
import com.finance.framework.view.controller.UIController;
import com.finance.view.CRModel;



public class FrameworkController implements Observer {
	private IAccountManager accountManger;
	private ICustomerManager customerManager;
	private ITransactionManager transactionManager;
	private IAbstractFactory abstractFactory;
	private UIController viewController;
	
	public FrameworkController(UIController uiController ) {
		abstractFactory = null; 
		this.viewController = uiController;
		if(uiController!=null)
		viewController.setFrameWorkcontroller(this);
		
	}
	
	public void injectServiceProviders(ICustomerManager customerManager,IAccountManager accountManager, 
			ITransactionManager transactionManager,IAbstractFactory factory){
		
		this.abstractFactory = factory;
		this.customerManager = customerManager;
		this.accountManger = accountManager;
		this.transactionManager = transactionManager;
		
		
		customerManager.setFrameworkController(this);
		accountManager.setFrameworkController(this);
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
		IAccount account = accountManger.findAccount(accountNumber);
		if(account!=null){
				abstractFactory.createTransaction(account, amount, type);
				return true;
		}
		return false;
	}
	
	public boolean createCustomer(CRModel form, String customerType, String accountType ){
		abstractFactory.createCustomerTemplate(form, customerType, accountType);		
		return true;
	}
	
	public void dataSetChanged(){
		//List<IDataSet> dataSetList = abstractFactory.getDataSet(customerManager);
		//viewController.updateTable(dataSetList);
	}
	
	public Report getReport(){
		return customerManager.getReport();
	}
	
	public void addInterest(){
		List<IAccount> accounts = accountManger.getAllAccounts();
		for(IAccount account: accounts){
			double interest = account.computeInterest();
			abstractFactory.createTransaction(account, interest, "addinterest");
		}
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		List<IDataSet> dataSetList = abstractFactory.getDataSet(customerManager);
		viewController.updateTable(dataSetList);

	}

}
