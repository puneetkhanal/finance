package framework.interfaces;

import java.util.List;


import framework.controllers.FrameworkController;
import framework.reporting.Report;

public interface ICustomerManager {
	public boolean addCustomer(ICustomer customer);
	public boolean submitCustomer(ICustomer customer);
	public ICustomer findCustomer(String name);
	public List<ICustomer> getAllCustomer();
	//public void setChanged() ;
	public void setFrameworkController(FrameworkController frameworkController);
	public Report getReport();
}
