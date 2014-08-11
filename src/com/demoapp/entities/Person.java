package com.demoapp.entities;

import java.util.Date;

import com.finance.entities.Address;
import com.finance.entities.Customer;
import com.finance.entities.Transaction;


public class Person extends Customer   {
	private Date dob;
	public Person(Address address, String name, String email) {
		super(address, name, email);
		
	}

	@Override
	public boolean checkEmailSendingCondition(Transaction transaction) {
		// TODO Auto-generated method stub
		return false;
	}


}
