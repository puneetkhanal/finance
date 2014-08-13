package com.finance.ui.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.finance.ui.controller.UIController;

public class ReportActionListener implements ActionListener {

	private UIController uiController;

	public ReportActionListener(UIController uiController) {
		this.uiController = uiController;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ReportView reportView = new ReportView(uiController.getReport()
				.getString(""));
		reportView.show();

	}

}
