package com.banknp.entities;

import com.finance.entities.AbstractAccount;
import com.finance.interfaces.ICustomer;
import com.finance.reporting.Report;

public class SavingAccount extends AbstractAccount{
	public SavingAccount(ICustomer customer,double irRate) {
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
		return 1.16;
	}

	@Override
	public Report getReport() {
		// TODO Auto-generated method stub
		return null;
	}

}
