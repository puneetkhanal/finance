package com.finance.ui.view.bank;

import javax.swing.JDialog;

import com.finance.ui.view.AbstractCRDialogFactory;

public class BankCRFormFactory extends AbstractCRDialogFactory {

	public BankCRFormFactory() {
	}

	@Override
	public JDialog createCRDialog(String type) {
		if (type.equalsIgnoreCase("personal")) {
			return new PersonalFormDialog(uiController);
		} else {
			return new CompanyFormDialog(uiController);
		}
	}

}
