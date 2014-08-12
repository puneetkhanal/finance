package com.finance.ui.view;

import javax.swing.JDialog;

import com.finance.ui.controller.UIController;

public abstract class AbstractCRDialogFactory {

	protected UIController uiController;

	public AbstractCRDialogFactory() {

	}
	
	public void setUIController(UIController uiController){
		this.uiController=uiController;
	}
	public abstract JDialog createCRDialog();
}