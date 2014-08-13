package com.finance.ui.view;

import javax.swing.JDialog;

import com.finance.ui.controller.UIController;

public abstract class AbstractCRFactory {

	protected UIController uiController;

	public AbstractCRFactory() {

	}
	
	public void setUIController(UIController uiController){
		this.uiController=uiController;
	}
	public abstract JDialog createCRDialog(String type);
}
