package com.finance.entities;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
	private List<ICustomer> customers = new ArrayList<ICustomer>();
	
	public boolean addCustomer(ICustomer customer){
		return customers.add(customer);
	}
	

}
