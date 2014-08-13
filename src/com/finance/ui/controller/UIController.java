package com.finance.ui.controller;

import com.finance.controllers.FrameworkController;

import java.util.List;

import com.finance.interfaces.IDataSet;
import com.finance.reporting.Report;
import com.finance.ui.view.AbstractMainView;
import com.finance.ui.view.CRModel;
import com.finance.ui.view.AbstractCRFactory;
import com.finance.ui.view.RegistrationActionListener;
import com.finance.ui.view.ReportActionListener;
import com.finance.ui.view.TRModel;
import com.finance.ui.view.TransactionActionListener;
import com.finance.ui.view.bank.PersonalModel;

public class UIController {

	private AbstractMainView mainView;
	protected AbstractCRFactory crDialogFactory;
	private FrameworkController frameworkController;

	public UIController(AbstractMainView mainView,
			AbstractCRFactory crDialogFactory) {
		this.mainView = mainView;
		this.crDialogFactory = crDialogFactory;
		crDialogFactory.setUIController(this);
		init();

	}

	public void setFrameWorkcontroller(FrameworkController frameworkController) {
		this.frameworkController = frameworkController;
	}

	private void init() {
		mainView.getCRPanel().addActionListener(
				new RegistrationActionListener(this, crDialogFactory));
		mainView.getTRPanel().addActionListener(
				new TransactionActionListener(this));
		mainView.getReportButton()
				.addActionListener(new ReportActionListener(this));
	}

	public void updateTable(List<IDataSet> dataSetList) {
		mainView.setTableModel(dataSetList);
	}

	public void transactionPerformed(TRModel trForm) {
		frameworkController.executeTransaction(
				Integer.parseInt(trForm.getName()), trForm.getAmount(),
				trForm.getTransactionType());
	}

	public void registerCustomer(CRModel crForm) {
		if(crForm instanceof PersonalModel)
		frameworkController.createCustomer(crForm, "", "");
	}

	public int getAccountNumber() {
		return mainView.getAccountNumber();
	}

	public Report getReport() {
		return frameworkController.getReport();
		
	}
}
