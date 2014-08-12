package com.finance.controllers;

import java.util.ArrayList;
import java.util.List;

import com.finance.entities.ICustomer;

public class CustomerManager {
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
