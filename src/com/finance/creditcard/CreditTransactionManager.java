package com.finance.creditcard;

import java.util.ArrayList;
import java.util.List;

import com.finance.creditcard.ReportComputer;
import com.finance.framework.entities.AbstractTransactionManager;
import com.finance.framework.entities.Transaction;
import com.finance.framework.intefaces.IAccount;
import com.finance.framework.reporting.Report;



public class CreditTransactionManager extends AbstractTransactionManager{
	private List<Transaction> transactions = new ArrayList<Transaction>();

	@Override
	public void addTransaction(Transaction transaction){
		transactions.add(transaction);
	}

	@Override
	public void computeReport(IAccount account,ReportComputer reportComputer) {
		Report report = new Report(null);
		for(Transaction t: transactions){
			if(t.getAccount()==account){
				reportComputer.compute(t);
				report.addChildReport(reportComputer.getReport() );
			}
		}
	}

	@Override
	public Report getReport() {
		return null;
	}

}
