package com.demoapp.entities;

import com.finance.entities.Address;
import com.finance.entities.Customer;
import com.finance.entities.Transaction;

public class Organisation extends Customer{

	public Organisation(Address address, String name, String email) {
		super(address, name, email);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean checkEmailSendingCondition(Transaction transaction) {
		// TODO Auto-generated method stub
		return false;
	}

}
