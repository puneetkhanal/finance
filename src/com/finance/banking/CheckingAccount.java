package com.finance.banking;

import java.util.HashMap;
import java.util.Map;

import com.finance.Account;
import com.finance.framework.intefaces.ICustomer;
import com.finance.framework.reporting.Report;



public class CheckingAccount extends Account {
	
	double interestRate;
	
	public CheckingAccount(ICustomer customer,double irRate) {
		super(customer);
		this.interestRate = irRate;
	}
	
	@Override
	public String getType() {
		return BankInformation.CHECKING;
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
		return getCurrentBalance()*interestRate;
	}
}
