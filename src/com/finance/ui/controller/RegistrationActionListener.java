package com.finance.ui.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.finance.ui.view.AbstractCRFactory;
import com.finance.ui.view.TypedJButton;
import com.finance.view.defaultview.CRModel;

public class RegistrationActionListener implements ActionListener {

	private UIController uiController;
	private AbstractCRFactory dialogFactory;

	public RegistrationActionListener(UIController uiController,
			AbstractCRFactory dialogFactory) {
		this.uiController = uiController;
		this.dialogFactory = dialogFactory;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		TypedJButton typedButton = (TypedJButton) e.getSource();
		dialogFactory.createCRDialog(typedButton.getType(),this).show();
	}

	public void registerCustomer(CRModel crModel) {
		uiController.registerCustomer(crModel);
	}

}
