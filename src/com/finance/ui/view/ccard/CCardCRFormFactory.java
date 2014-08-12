package com.finance.ui.view.ccard;

import javax.swing.JDialog;

import com.finance.ui.view.AbstractCRDialogFactory;

public class CCardCRFormFactory extends AbstractCRDialogFactory {

	public CCardCRFormFactory() {
	}

	@Override
	public JDialog createCRDialog(String type) {
		return new CCardCRFormDialog(uiController);
	}

}
