package com.demoapp.entities;

import com.finance.entities.Transaction;
import com.finance.interfaces.IAccount;

public class Deposit extends Transaction {

	public Deposit(IAccount account, Double amount, String name) {
		super(account, amount, name);
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Deposit";
	}

}
