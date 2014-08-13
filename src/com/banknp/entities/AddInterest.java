package com.banknp.entities;

import com.finance.entities.Transaction;
import com.finance.interfaces.IAccount;

public class AddInterest extends Transaction{

	public AddInterest(IAccount account, Double amount, String name) {
		super(account, amount, name);
	}

	@Override
	public String getType() {
		return "interest";
	}

}
