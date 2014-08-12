package com.finance.reporting;

import com.finance.entities.Transaction;

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
