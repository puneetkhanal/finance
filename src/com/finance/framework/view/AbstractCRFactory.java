package com.finance.framework.view;

import javax.swing.JDialog;

import com.finance.framework.view.controller.RegistrationActionListener;
import com.finance.framework.view.controller.UIController;


public abstract class AbstractCRFactory {

	protected UIController uiController;

	public AbstractCRFactory() {

	}
	
	public abstract JDialog createCRDialog(String type,RegistrationActionListener listener);
}
