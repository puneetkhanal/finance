package com.finance.entities;

import java.util.Observable;

import com.finance.controllers.FrameworkController;
import com.finance.interfaces.IAccountManager;

public abstract class AbstractAccountManager extends Observable implements IAccountManager{
	private FrameworkController frameworkController;
	
	public final void setFrameworkController(FrameworkController frameworkController){
		this.frameworkController = frameworkController;
	}

	@Override
	public final void setChanged() {
		frameworkController.dataSetChanged();
		
	}

}
