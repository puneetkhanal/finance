package com.finance.banking;

import java.util.ArrayList;
import java.util.List;

import com.finance.TransactionManager;
import com.finance.creditcard.ReportComputer;
import com.finance.framework.entities.Transaction;
import com.finance.framework.intefaces.IAccount;
import com.finance.framework.reporting.Report;



public class BankTransactionManager extends TransactionManager{
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
