package com.finance.ui.view.bank;

import javax.swing.JDialog;

import com.finance.ui.view.AbstractCRDialogFactory;

public class BankCRFormFactory extends AbstractCRDialogFactory {

	public BankCRFormFactory() {
	}

	@Override
	public JDialog createCRDialog() {
		return new BankCRFormDialog(uiController);
	}

}
