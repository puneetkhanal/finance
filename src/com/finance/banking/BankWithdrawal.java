package com.finance.banking;


import com.finance.framework.entities.Transaction;
import com.finance.framework.intefaces.IAccount;


public class BankWithdrawal extends Transaction{

	public BankWithdrawal(IAccount account, Double amount, String name) {
		super(account, -amount, name);
	}

	@Override
	public String getType() {
		return "WithDrawal";
	}
	@Override
	public void execute() {
		super.execute();
		account.setChanged();
	}

}
