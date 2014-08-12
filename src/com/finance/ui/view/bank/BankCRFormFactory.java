package com.finance.ui.view.bank;

import javax.swing.JDialog;

import com.finance.ui.controller.UIController;
import com.finance.ui.view.AbstractCRDialogFactory;

public class BankCRFormFactory extends AbstractCRDialogFactory {

	public BankCRFormFactory(UIController uiController) {
		super(uiController);
	}

	@Override
	public JDialog createCRDialog() {
		return new BankCRFormDialog(uiController);
	}

}
