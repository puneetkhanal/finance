package com.banknp.entities;

import java.util.ArrayList;
import java.util.List;

import com.creditnp.entities.ReportComputer;
import com.demoapp.entities.TransactionManager;
import com.finance.entities.AbstractTransactionManager;
import com.finance.entities.Transaction;
import com.finance.interfaces.IAccount;
import com.finance.reporting.Report;

public class BankTransactionManager extends TransactionManager{
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
