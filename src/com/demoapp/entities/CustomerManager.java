package com.demoapp.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.finance.entities.AbstractCustomerManager;
import com.finance.interfaces.ICustomer;
import com.finance.reporting.Report;


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
	@Override
	public Report getReport() {
		Map<String, String> map = new HashMap<String, String>();
		List<ICustomer> customers= getAllCustomer();
		map.put("Total Customers", ""+customers.size()+"");
		Report myReport = new Report(map);
		for(ICustomer c: customers){
			myReport.addChildReport(c.getReport());
		}
		return myReport;
	}
	

}
