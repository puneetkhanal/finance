package com.finance.ui.controller;

import com.finance.controllers.FrameworkController;

import java.util.List;

import com.finance.interfaces.IDataSet;
import com.finance.reporting.Report;
import com.finance.ui.view.MainView;
import com.finance.ui.view.AbstractCRFactory;
import com.finance.view.defaultview.CRModel;
import com.finance.view.defaultview.TRModel;

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
