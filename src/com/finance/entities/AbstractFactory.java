package com.finance.entities;

import com.finance.reporting.IReportComputer;
import com.finance.ui.view.CRForm;

public interface AbstractFactory {
	public IReportComputer getReportComputer();
	public Transaction getTransaction(Account account,double amount,String type);
	public Customer getCustomer(CRForm form, String type);
	public Account getAccount(CRForm form, Customer customer);
}
