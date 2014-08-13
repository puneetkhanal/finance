package com.creditnp.entities;

import com.finance.entities.Transaction;
import com.finance.reporting.IReportComputer;
import com.finance.reporting.Report;

public class ReportComputer implements IReportComputer<Report, Transaction> {
	private Report report;
	@Override
	public void compute(Transaction t) {
		
	}
	@Override
	public Report getReport() {
		return report;
	}
	
}
