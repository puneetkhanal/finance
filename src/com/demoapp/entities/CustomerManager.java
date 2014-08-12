package com.demoapp.entities;

import java.util.ArrayList;
import java.util.List;

import com.finance.entities.AbstractCustomerManager;
import com.finance.interfaces.ICustomer;


public class CustomerManager extends AbstractCustomerManager {
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
