package com.finance.entities;

import java.util.List;

import com.finance.controllers.CustomerManager;
import com.finance.interfaces.ICustomer;
import com.finance.reporting.IReportComputer;
import com.finance.ui.view.CRForm;

public interface AbstractFactory {
	public IReportComputer getReportComputer();
	public Transaction getTransaction(Account account,double amount,String type);
	public Customer getCustomer(CRForm form, String customerType,String accountType);
	public Account getAccount(CRForm form, ICustomer customer);
	public List<IDataSet> getDataSet(CustomerManager customerManager);
}
