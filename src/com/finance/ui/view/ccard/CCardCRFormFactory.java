package com.finance.ui.view.ccard;

import javax.swing.JDialog;

import com.finance.ui.controller.RegistrationActionListener;
import com.finance.ui.view.AbstractCRFactory;

public class CCardCRFormFactory extends AbstractCRFactory {

	public CCardCRFormFactory() {
	}

	@Override
	public JDialog createCRDialog(String type,RegistrationActionListener listener) {
		return new CCardCRDialog(listener);
	}

}
