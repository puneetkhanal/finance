package com.finance.ui.view.bank;

import javax.swing.JDialog;

import com.finance.ui.controller.RegistrationActionListener;
import com.finance.ui.view.AbstractCRFactory;

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
