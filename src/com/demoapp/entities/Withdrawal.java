package com.demoapp.entities;

import com.finance.entities.Transaction;
import com.finance.interfaces.IAccount;

public class Withdrawal extends Transaction{

	public Withdrawal(IAccount account, Double amount, String name) {
		super(account, -amount, name);
	}

	@Override
	public String getType() {
		return "WithDrawal";
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		super.execute();
		account.setChanged();
	}
}
