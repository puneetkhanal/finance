package com.creditnp.entities;

import com.finance.entities.AbstractAccount;
import com.finance.interfaces.ICustomer;
import com.finance.reporting.Report;

public class BronzeCreditAccount extends AbstractAccount{

	public BronzeCreditAccount(int acc_no, ICustomer customer) {
		super(acc_no, customer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Report getReport() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double computeInterest() {
		// TODO Auto-generated method stub
		return 0;
	}

}
