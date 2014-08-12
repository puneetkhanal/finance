package com.demoapp.entities;

import com.finance.entities.Account;
import com.finance.entities.Transaction;

public class Withdrawal extends Transaction{

	public Withdrawal(Account account, Double amount, String name) {
		super(account, -amount, name);
	}

	@Override
	public String getType() {
		return "WithDrawal";
	}

}
