package com.finance.banking;


import com.finance.framework.entities.Transaction;
import com.finance.framework.intefaces.IAccount;


public class AddInterest extends Transaction{

	public AddInterest(IAccount account, Double amount, String name) {
		super(account, amount, name);
	}

	@Override
	public String getType() {
		return "interest";
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		super.execute();
		account.setChanged();
	}

}
