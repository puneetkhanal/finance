package com.finance.ui.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.finance.ui.controller.UIController;

public class RegistrationActionListener implements ActionListener {

	private UIController uiController;

	public RegistrationActionListener(UIController uiController) {
		this.uiController = uiController;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CRFormDialog customerForm = new CRFormDialog(uiController);
		customerForm.setBounds(450, 20, 300, 330);
		customerForm.show();

	}

}
