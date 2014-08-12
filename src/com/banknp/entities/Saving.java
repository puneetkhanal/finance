package com.banknp.entities;

import com.finance.entities.Account;
import com.finance.interfaces.ICustomer;

public class Saving extends Account{
	private double interestRate;
	public Saving(ICustomer customer,double irRate) {
		super(customer);
		interestRate = irRate;
	}
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Saving";
	}

}
