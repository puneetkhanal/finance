package com.finance.entities;

import java.util.Observable;

import com.finance.controllers.FrameworkController;
import com.finance.interfaces.ICustomer;
import com.finance.interfaces.ICustomerManager;

public abstract  class AbstractCustomerManager extends Observable implements ICustomerManager {
	private FrameworkController frameworkController;
	@Override
	public final void setFrameworkController(FrameworkController frameworkController) {
		this.frameworkController = frameworkController;
		addObserver(frameworkController);
		
	}
	
	@Override
	public final boolean submitCustomer(ICustomer customer) {
		addCustomer(customer);
		setChanged();
		notifyObservers();
		return true;
	}
	
//	public final void  setChanged(){
//		//frameworkController.dataSetChanged();
//	}
//	

}
