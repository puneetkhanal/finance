package com.finance.interfaces;

import com.creditnp.entities.ReportComputer;
import com.finance.entities.Transaction;
import com.finance.reporting.Report;

public interface ITransactionManager {

	public void addTransaction(Transaction transaction);
	public void addTransactionTemplate(Transaction transaction);
	public void computeReport(IAccount account,ReportComputer reportComputer);
	public Report getReport();
}
