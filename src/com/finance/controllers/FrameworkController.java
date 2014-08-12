package com.finance.controllers;

import com.finance.entities.AbstractFactory;
import com.finance.entities.Account;
import com.finance.entities.Customer;
import com.finance.entities.DataSet;
import com.finance.entities.Transaction;
import com.finance.ui.controller.UIController;
import com.finance.ui.view.CRForm;

public class FrameworkController {
	private AccountManager accountManger;
	private CustomerManager customerManager;
	private AbstractFactory abstractFactory;
	private UIController viewController;
	
	public FrameworkController(UIController uiController ) {
		accountManger = new AccountManager(this);
		customerManager = new CustomerManager();
		abstractFactory = null;
		this.viewController = uiController;
		viewController.setFrameWorkcontroller(this);
	}
	
	public void setUIController(UIController uiController){
		viewController = uiController;
	}
	public void setApplicationFactory(AbstractFactory factory){
		abstractFactory = factory;
	}
	
	public boolean executeTransaction(int accountNumber, double amount, String type){
		Account account = accountManger.findAccount(accountNumber);
		if(account!=null){
			if(abstractFactory!=null){
				Transaction transaction =abstractFactory.getTransaction(account, amount, type);
				account.executeTransaction(transaction);
				return true;
			}
		}
		return false;
	}
	
	public boolean createCustomer(CRForm form, String type ){
		Customer customer = abstractFactory.getCustomer(form,type);		
		if(customer!=null){
			Account account = abstractFactory.getAccount(form,customer);
			if(account!=null){
				customer.addAccount(account);
				customerManager.addCustomer(customer);
				accountManger.addAccount(account);
				return true;
			}
		}
		return false;
	}
	
	public void dataSetChanged(){
		DataSet dataSet = abstractFactory.getDataSet(customerManager);
	}
}
