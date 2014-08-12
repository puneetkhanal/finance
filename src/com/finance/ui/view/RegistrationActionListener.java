package com.finance.ui.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.finance.ui.controller.UIController;

public class RegistrationActionListener implements ActionListener {

	private UIController uiController;
	private AbstractCRDialogFactory dialogFactory;

	public RegistrationActionListener(UIController uiController,
			AbstractCRDialogFactory dialogFactory) {
		this.uiController = uiController;
		this.dialogFactory=dialogFactory;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		TypedJButton typedButton=(TypedJButton) e.getSource();
		dialogFactory.createCRDialog(typedButton.getType()).show();

	}

}
