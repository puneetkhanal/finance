package com.banknp.entities;

import com.finance.entities.Account;
import com.finance.interfaces.ICustomer;

public class Checking extends Account {
	private double interestRate;
	public Checking(ICustomer customer,double irRate) {
		super(customer);
		interestRate = irRate;
	}
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Saving";
	}
}
