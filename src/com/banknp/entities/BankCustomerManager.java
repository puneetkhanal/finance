package com.banknp.entities;

import java.util.ArrayList;
import java.util.List;

import com.finance.entities.AbstractAccountManager;
import com.finance.entities.AbstractCustomerManager;
import com.finance.interfaces.ICustomer;
import com.finance.interfaces.ICustomerManager;


public class BankCustomerManager extends AbstractCustomerManager {
	private List<ICustomer> customers = new ArrayList<ICustomer>();
	
	public boolean addCustomer(ICustomer customer){
		return customers.add(customer);
	}
	public ICustomer findCustomer(String name){
		return null;
		
	}
	public List<ICustomer> getAllCustomer(){
		return customers;
		
	}
	

}
