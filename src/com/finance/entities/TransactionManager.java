package com.finance.entities;

import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
	private List<Transaction> transactions = new ArrayList<Transaction>();

	public void addTransaction(Transaction transaction){
		transactions.add(transaction);
		transaction.execute();
	}
	
	
	
	public double getLastMonthBalance(){
		return 0;
	}
}
