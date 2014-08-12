package com.finance.ui.view;

import javax.swing.JDialog;

import com.finance.ui.controller.UIController;

public class DefaultCRDialogFactory extends AbstractCRDialogFactory {

	public DefaultCRDialogFactory(UIController uiController) {
		super(uiController);
	}

	@Override
	public JDialog createCRDialog() {
		return new CRFormDialog(uiController);
	}



}
