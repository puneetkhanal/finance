package finance;

import java.util.ArrayList;
import java.util.List;


import creditcard.ReportComputer;
import framework.entities.AbstractTransactionManager;
import framework.entities.Transaction;
import framework.interfaces.IAccount;
import framework.reporting.Report;

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
