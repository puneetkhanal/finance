package com.finance.entities;

import com.finance.controllers.FrameworkController;
import com.finance.interfaces.IAccountManager;

public abstract class AbstractAccountManager implements IAccountManager{
	private FrameworkController frameworkController;
	
	public final void setFrameworkController(FrameworkController frameworkController){
		this.frameworkController = frameworkController;
	}

	@Override
	public final void setChanged() {
		frameworkController.dataSetChanged();
		
	}

}
