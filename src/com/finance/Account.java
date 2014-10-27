package com.finance;

import java.util.HashMap;
import java.util.Map;

import com.finance.framework.entities.AbstractAccount;
import com.finance.framework.intefaces.ICustomer;
import com.finance.framework.reporting.Report;




public class Account extends AbstractAccount {

	public Account(ICustomer customer) {
		super(customer);
		// TODO Auto-generated constructor stub
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

	@Override
	public double computeInterest() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String getExpiryDate() {
		// TODO Auto-generated method stub
		return null;
	}


}
