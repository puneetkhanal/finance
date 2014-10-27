package com.finance.framework.intefaces;

import java.util.List;

import com.finance.framework.controllers.FrameworkController;
import com.finance.framework.reporting.Report;



public interface ICustomerManager {
	public boolean addCustomer(ICustomer customer);
	public boolean submitCustomer(ICustomer customer);
	public ICustomer findCustomer(String name);
	public List<ICustomer> getAllCustomer();
	//public void setChanged() ;
	public void setFrameworkController(FrameworkController frameworkController);
	public Report getReport();
}
