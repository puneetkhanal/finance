package com.finance.banking.view;

import javax.swing.JDialog;

import com.finance.framework.view.AbstractCRFactory;
import com.finance.framework.view.controller.RegistrationActionListener;



public class BankCRFactory extends AbstractCRFactory {

	public BankCRFactory() {
	}

	@Override
	public JDialog createCRDialog(String type,RegistrationActionListener listener) {
		if (type.equalsIgnoreCase("personal")) {
			return new PersonalDialog(listener);
		} else {
			return new CompanyDialog(listener);
		}
	}

}
