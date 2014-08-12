package com.demoapp.entities;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.views.AbstractView;

import com.finance.entities.AbstractTransactionManager;
import com.finance.entities.Account;
import com.finance.entities.Transaction;
import com.finance.interfaces.ITransactionManager;
import com.finance.reporting.IReportComputer;
import com.finance.reporting.ReportComputer;

public class TransactionManager extends AbstractTransactionManager{
	private List<Transaction> transactions = new ArrayList<Transaction>();

	public void addTransaction(Transaction transaction){
		transactions.add(transaction);
	}

	@Override
	public void computeReport(Account account,ReportComputer reportComputer) {
		// TODO Auto-generated method stub
		
	}

}
