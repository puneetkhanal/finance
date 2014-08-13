package com.finance.ui.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.finance.ui.view.TypedJButton;
import com.finance.view.defaultview.TRDialog;

public class TransactionActionListener implements ActionListener {

	private UIController uiController;

	public TransactionActionListener(UIController uiController) {
		this.uiController = uiController;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		TypedJButton button = (TypedJButton) e.getSource();
		if (button.getType().equals("addinterest")) {
			uiController.addInterest();
		} else {
			TRDialog trDialog = new TRDialog(uiController, button.getType(),
					uiController.getAccountNumber());
			trDialog.setBounds(430, 15, 275, 140);
			trDialog.show();
		}
	}

}
