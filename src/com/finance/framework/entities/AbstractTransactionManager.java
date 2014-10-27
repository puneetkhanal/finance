package com.finance.framework.entities;

import com.finance.framework.intefaces.ITransactionManager;

public abstract class AbstractTransactionManager implements ITransactionManager{

	@Override
	public final void addTransactionTemplate(Transaction transaction) {
		transaction.execute();
		addTransaction(transaction);
	}
	
}
