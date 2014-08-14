package framework.entities;

import java.util.Observable;


import framework.controllers.FrameworkController;
import framework.interfaces.IAccountManager;

public abstract class AbstractAccountManager extends Observable implements IAccountManager{
	private FrameworkController frameworkController;
	
	@Override
	public final void setFrameworkController(FrameworkController frameworkController){
		this.frameworkController = frameworkController;
		addObserver(frameworkController);
		
	}

	@Override
	public final void setAccountChanged() {
		setChanged();
		notifyObservers();
	}

}
