package com.finance.ui.view;

import javax.swing.JDialog;

import com.finance.ui.controller.RegistrationActionListener;
import com.finance.ui.controller.UIController;

public abstract class AbstractCRFactory {

	protected UIController uiController;

	public AbstractCRFactory() {

	}
	
	public abstract JDialog createCRDialog(String type,RegistrationActionListener listener);
}
