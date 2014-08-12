package com.finance.ui.view;

import javax.swing.JDialog;

public class DefaultCRDialogFactory extends AbstractCRDialogFactory {

	public DefaultCRDialogFactory() {
		super();
	}

	@Override
	public JDialog createCRDialog(String type) {
		JDialog crDialog = new CRFormDialog(uiController);
		crDialog.setBounds(450, 20, 300, 330);
		return crDialog;
	}

}
