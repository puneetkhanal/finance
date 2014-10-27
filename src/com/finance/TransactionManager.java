package com.finance;

import java.util.ArrayList;
import java.util.List;

import com.finance.creditcard.ReportComputer;
import com.finance.framework.entities.AbstractTransactionManager;
import com.finance.framework.entities.Transaction;
import com.finance.framework.intefaces.IAccount;
import com.finance.framework.reporting.Report;



public class TransactionManager extends AbstractTransactionManager{
	private List<Transaction> transactions = new ArrayList<Transaction>();

	@Override
	public void addTransaction(Transaction transaction){
		transactions.add(transaction);
	}

	@Override
	public void computeReport(IAccount account,ReportComputer reportComputer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Report getReport() {
		// TODO Auto-generated method stub
		return null;
	}

}
