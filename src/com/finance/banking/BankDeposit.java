package com.finance.banking;


import com.finance.framework.entities.Transaction;
import com.finance.framework.intefaces.IAccount;


public class BankDeposit extends Transaction {

	public BankDeposit(IAccount account, Double amount, String name) {
		super(account, amount, name);
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Deposit";
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		super.execute();
		account.setChanged();
	}

}
