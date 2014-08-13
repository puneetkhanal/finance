package com.finance.interfaces;

import java.util.List;

import com.finance.controllers.FrameworkController;
import com.finance.reporting.Report;

public interface ICustomerManager {
	public boolean addCustomer(ICustomer customer);
	public boolean submitCustomer(ICustomer customer);
	public ICustomer findCustomer(String name);
	public List<ICustomer> getAllCustomer();
	//public void setChanged() ;
	public void setFrameworkController(FrameworkController frameworkController);
	public Report getReport();
}
