package com.finance.view.defaultview;

import javax.swing.JDialog;

import com.finance.ui.controller.RegistrationActionListener;
import com.finance.ui.view.AbstractCRFactory;

public class DefaultCRDialogFactory extends AbstractCRFactory {

	public DefaultCRDialogFactory() {
		super();
	}

	@Override
	public JDialog createCRDialog(String type,RegistrationActionListener listener) {
		JDialog crDialog = new CRDialog(listener);
		crDialog.setBounds(450, 20, 300, 330);
		return crDialog;
	}

}
