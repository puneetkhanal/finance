package com.demoapp.entities;

import java.util.HashMap;
import java.util.Map;

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
		Map<String,String> myReport = new HashMap<String, String>();
		myReport.put("Account Number", ""+getAccountNumber()+"");
		myReport.put("Balance", ""+getCurrentBalance()+"");
		return new Report(myReport);
	}


}
