package com.finance.framework.intefaces;


import com.finance.creditcard.ReportComputer;
import com.finance.framework.entities.Transaction;
import com.finance.framework.reporting.Report;


public interface ITransactionManager {

	public void addTransaction(Transaction transaction);
	public void addTransactionTemplate(Transaction transaction);
	public void computeReport(IAccount account,ReportComputer reportComputer);
	public Report getReport();
}
