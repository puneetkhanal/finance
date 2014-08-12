package com.finance.entities;

import com.finance.interfaces.ITransactionManager;

public abstract class AbstractTransactionManager implements ITransactionManager{

	@Override
	public final void addTransactionTemplate(Transaction transaction) {
		transaction.execute();
		addTransaction(transaction);
	}
	
}
