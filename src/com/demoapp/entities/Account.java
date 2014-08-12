package com.demoapp.entities;

import com.finance.entities.AbstractAccount;
import com.finance.interfaces.ICustomer;
import com.finance.reporting.Report;

public class Account extends AbstractAccount {

	public Account(ICustomer customer) {
		super(customer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getInterestRate() {
		return 1.10;
	}


	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "default";
	}

	@Override
	public Report getReport() {
		// TODO Auto-generated method stub
		return null;
	}


}
