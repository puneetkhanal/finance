package com.finance.framework.view.controller;


import java.util.List;

import com.finance.framework.controllers.FrameworkController;
import com.finance.framework.intefaces.IDataSet;
import com.finance.framework.reporting.Report;
import com.finance.framework.view.AbstractCRFactory;
import com.finance.framework.view.MainView;
import com.finance.view.CRModel;
import com.finance.view.TRModel;



public class UIController {

	private MainView mainView;
	protected AbstractCRFactory crDialogFactory;
	private FrameworkController frameworkController;

	public UIController(MainView mainView,
			AbstractCRFactory crDialogFactory) {
		this.mainView = mainView;
		this.crDialogFactory = crDialogFactory;
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
		mainView.getReportButton().addActionListener(
				new ReportActionListener(this));
	}

	public void updateTable(List<IDataSet> dataSetList) {
		mainView.setTableModel(dataSetList);
	}

	public void transactionPerformed(TRModel trForm) {
		frameworkController.executeTransaction(
				Integer.parseInt(trForm.getName()), trForm.getAmount(),
				trForm.getTransactionType());
	}

	public void registerCustomer(CRModel crModel) {
		frameworkController.createCustomer(crModel, "", "");
	}

	public int getAccountNumber() {
		return mainView.getAccountNumber();
	}

	public Report getReport() {
		return frameworkController.getReport();

	}

	public void addInterest() {
		frameworkController.addInterest();
	}
}
