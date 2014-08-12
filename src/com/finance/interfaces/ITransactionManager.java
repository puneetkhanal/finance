package com.finance.interfaces;

import com.finance.entities.AbstractAccount;
import com.finance.entities.Transaction;
import com.finance.reporting.ReportComputer;

public interface ITransactionManager {

	public void addTransaction(Transaction transaction);
	public void addTransactionTemplate(Transaction transaction);
	public void computeReport(IAccount account,ReportComputer reportComputer);
}
