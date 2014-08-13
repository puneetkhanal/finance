package com.creditnp.entities;

import java.util.HashMap;
import java.util.Map;

import com.finance.entities.AbstractAccount;
import com.finance.interfaces.ICustomer;
import com.finance.reporting.Report;

public class SilverCreditAccount extends AbstractAccount {

	
	public SilverCreditAccount(int acc_no, ICustomer customer) {
		super(acc_no, customer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "silver";
	}

	@Override
	public Report getReport() {
		Map<String,String> myReport = new HashMap<String, String>();
		myReport.put("Account Number", ""+getAccountNumber()+"");
		myReport.put("Account Type", ""+getType());
		
		Report report = new Report(myReport);
		
		ReportComputer reportComputer = new ReportComputer();
		transactionManger.computeReport(this, reportComputer);
		report.addChildReport(reportComputer.getReport());
		return report;
	}

	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double computeInterest() {
		// TODO Auto-generated method stub
		return 0;
	}

}
