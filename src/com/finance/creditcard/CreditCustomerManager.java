package com.finance.creditcard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.finance.framework.entities.AbstractCustomerManager;
import com.finance.framework.intefaces.ICustomer;
import com.finance.framework.reporting.Report;




public class CreditCustomerManager extends AbstractCustomerManager {
	private List<ICustomer> customers = new ArrayList<ICustomer>();
	
	@Override
	public boolean addCustomer(ICustomer customer){
		return customers.add(customer);
	}
	@Override
	public ICustomer findCustomer(String name){
		return null;
		
	}
	@Override
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
