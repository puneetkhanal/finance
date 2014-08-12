package com.finance.interfaces;

import com.finance.entities.Account;
import com.finance.entities.Transaction;
import com.finance.reporting.ReportComputer;

public interface ITransactionManager {

	public void addTransaction(Transaction transaction);
	public void addTransactionTemplate(Transaction transaction);
	public void computeReport(Account account,ReportComputer reportComputer);
}
