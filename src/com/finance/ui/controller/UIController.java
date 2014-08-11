package com.finance.ui.controller;

import com.finance.ui.view.AbstractMainView;
import com.finance.ui.view.RegistrationActionListener;
import com.finance.ui.view.ReportActionListener;
import com.finance.ui.view.TransactionActionListener;

public class UIController {

	private AbstractMainView mainView;

	public UIController(AbstractMainView mainView) {
		this.mainView = mainView;
		init();
	}

	private void init() {
		mainView.getCRPanel().addActionListener(
				new RegistrationActionListener());
		mainView.getTRPanel()
				.addActionListener(new TransactionActionListener());

		mainView.getReportButton()
				.addActionListener(new ReportActionListener());
	}

	public void updateTable() {
		// to do
		mainView.setTableModel(null);
	}
}
