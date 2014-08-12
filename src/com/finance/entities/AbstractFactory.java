package com.finance.entities;

import com.finance.interfaces.IAbstractFactory;
import com.finance.interfaces.IAccountManager;
import com.finance.interfaces.ICustomer;
import com.finance.interfaces.ICustomerManager;
import com.finance.ui.view.CRForm;

public abstract class AbstractFactory implements IAbstractFactory {
	private ICustomerManager customerManager;
	private IAccountManager accountManager;
	@Override
	 public final void createCustomerTemplate(CRForm form, String customerType,
			String accountType) {
		
		ICustomer customer = createCustomer(form, customerType);
		Account account = createAccount(form, customer, accountType);
		customer.addAccount(account);
		customerManager.addCustomer(customer);
		accountManager.addAccount(account);
	}
	
	 public final void setCustomerManager(ICustomerManager customerManager){
		this.customerManager = customerManager;
	}
	public final void setAccountManaget(IAccountManager accountManager){
		this.accountManager = accountManager;
	}
	
	 

}
