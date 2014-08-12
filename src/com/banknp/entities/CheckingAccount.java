package com.banknp.entities;

import com.finance.entities.AbstractAccount;
import com.finance.interfaces.ICustomer;
import com.finance.reporting.Report;

public class CheckingAccount extends AbstractAccount {
	public CheckingAccount(ICustomer customer) {
		super(customer);
	}
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return BankInformation.SAVING;
	}

	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return 1.10;
	}

	@Override
	public Report getReport() {
		// TODO Auto-generated method stub
		return null;
	}
}
