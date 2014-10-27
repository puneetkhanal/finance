package com.finance.creditcard;


import com.finance.framework.entities.Transaction;
import com.finance.framework.intefaces.IAccount;


public class CreditCharge extends Transaction{

	public CreditCharge(IAccount account, Double amount, String name) {
		super(account, -amount, name);
	}

	@Override
	public String getType() {
		return "Charge";
	}
	
	@Override
	public void execute() {
		super.execute();
		account.setChanged();
	}
}
