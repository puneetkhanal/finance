package com.demoapp.entities;

import com.finance.entities.Account;
import com.finance.entities.Transaction;

public class Deposit extends Transaction {

	public Deposit(Account account, Double amount, String name) {
		super(account, amount, name);
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Deposit";
	}

}
