package com.finance.entities;

import com.finance.controllers.FrameworkController;
import com.finance.interfaces.ICustomer;
import com.finance.interfaces.ICustomerManager;

public abstract  class AbstractCustomerManager implements ICustomerManager {
	private FrameworkController frameworkController;
	@Override
	public final void setFrameworkController(FrameworkController frameworkController) {
		this.frameworkController = frameworkController;
		
	}
	
	@Override
	public final boolean submitCustomer(ICustomer customer) {
		addCustomer(customer);
		setChanged();
		return true;
	}
	
	public final void  setChanged(){
		frameworkController.dataSetChanged();
	}
	

}
