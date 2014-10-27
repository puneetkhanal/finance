package com.finance.creditcard.view;

import javax.swing.JDialog;

import com.finance.framework.view.AbstractCRFactory;
import com.finance.framework.view.controller.RegistrationActionListener;



public class CCardCRFormFactory extends AbstractCRFactory {

	public CCardCRFormFactory() {
	}

	@Override
	public JDialog createCRDialog(String type,RegistrationActionListener listener) {
		return new CCardCRDialog(listener);
	}

}
