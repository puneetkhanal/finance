package framework.view.controller;


import java.util.List;


import finance.view.CRModel;
import finance.view.TRModel;
import framework.controllers.FrameworkController;
import framework.interfaces.IDataSet;
import framework.reporting.Report;
import framework.view.AbstractCRFactory;
import framework.view.MainView;

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
