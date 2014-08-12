package com.finance.ui.controller;

import com.finance.controllers.FrameworkController;
import com.finance.ui.view.AbstractMainView;
import com.finance.ui.view.CRForm;
import com.finance.ui.view.AbstractCRDialogFactory;
import com.finance.ui.view.RegistrationActionListener;
import com.finance.ui.view.TRForm;
import com.finance.ui.view.TransactionActionListener;

public class UIController {

	private AbstractMainView mainView;
	protected AbstractCRDialogFactory crDialogFactory;
	private FrameworkController frameworkController;

	public UIController(AbstractMainView mainView,
			AbstractCRDialogFactory crDialogFactory,FrameworkController frameworkController) {
		this.mainView = mainView;
		this.crDialogFactory = crDialogFactory;
		this.frameworkController = frameworkController;
		frameworkController.setUIController(this);
		crDialogFactory.setUIController(this);
		init();
		
	}
	
	

	private void init() {
		mainView.getCRPanel().addActionListener(
				new RegistrationActionListener(this, crDialogFactory));
		mainView.getTRPanel().addActionListener(
				new TransactionActionListener(this));

		// mainView.getReportButton()
		// .addActionListener(new ReportActionListener());
	}

	public void updateTable() {
		// to do
		mainView.setTableModel(null);
	}

	public void transactionPerformed(TRForm trForm) {
		System.out.println(trForm.getAmount());

	}

	public void registerCustomer(CRForm crForm) {
		System.out.println(crForm.getName());

	}
}
