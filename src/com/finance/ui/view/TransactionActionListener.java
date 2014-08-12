package com.finance.ui.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.finance.ui.controller.UIController;

public class TransactionActionListener implements ActionListener {

	private UIController uiController;

	public TransactionActionListener(UIController uiController) {
		this.uiController = uiController;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		TypedJButton button=(TypedJButton) e.getSource();
		TRFormDialog trDialog = new TRFormDialog(uiController,button.getType(),uiController.getAccountNumber());
		trDialog.setBounds(430, 15, 275, 140);
		trDialog.show();
	}

}
