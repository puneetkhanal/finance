package com.creditnp.entities;

import org.w3c.dom.views.AbstractView;

import com.finance.entities.AbstractAccount;
import com.finance.interfaces.ICustomer;
import com.finance.reporting.Report;

public class GoldCreditAccount extends AbstractAccount{

	public GoldCreditAccount(int acc_no, ICustomer customer) {
		super(acc_no, customer);
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
