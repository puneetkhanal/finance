package com.finance.reporting;

import java.util.ArrayList;
import java.util.HashMap;

import com.finance.entities.Transaction;

public class ReportComputer implements IReportComputer<Report, Transaction> {
	private Report report;
	@Override
	public void compute(Transaction t) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Report getReport() {
		return report;
	}
	
}
