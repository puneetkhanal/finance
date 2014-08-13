package com.banknp.entities;

import java.util.ArrayList;
import java.util.List;

import com.finance.entities.AbstractTransactionManager;
import com.finance.entities.Transaction;
import com.finance.interfaces.IAccount;
import com.finance.reporting.Report;
import com.finance.reporting.ReportComputer;

public class BankTransactionManager extends AbstractTransactionManager{
	private List<Transaction> transactions = new ArrayList<Transaction>();

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
