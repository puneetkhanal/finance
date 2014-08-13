package com.banknp.entities;

import java.util.HashMap;
import java.util.Map;

import com.finance.entities.AbstractAccount;
import com.finance.interfaces.ICustomer;
import com.finance.reporting.Report;

public class CheckingAccount extends AbstractAccount {
	public CheckingAccount(ICustomer customer) {
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
		return 1.10;
	}

	@Override
	public Report getReport() {
		Map<String,String> myReport = new HashMap<String, String>();
		myReport.put("Account Number", ""+getAccountNumber()+"");
		myReport.put("Accuont Type", getType());
		myReport.put("Balance", ""+getCurrentBalance()+"");
		return new Report(myReport);
	}

	@Override
	public double computeInterest() {
		return getCurrentBalance()*getInterestRate();
	}
}
