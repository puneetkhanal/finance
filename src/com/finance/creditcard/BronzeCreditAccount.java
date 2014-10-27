package com.finance.creditcard;

import java.util.HashMap;
import java.util.Map;

import com.finance.framework.entities.AbstractAccount;
import com.finance.framework.intefaces.ICustomer;
import com.finance.framework.reporting.Report;




public class BronzeCreditAccount extends AbstractAccount{
	private double monthlyInterest;
	private double monthlyPayment;
	private String expiryDate;
	public BronzeCreditAccount(int acc_no, ICustomer customer,String expiryDate) {
		super(acc_no, customer);
		monthlyInterest =0.1;
		monthlyPayment = 0.14;
		this.expiryDate = expiryDate;
		
	}


	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "bronze";
	}

	@Override
	public Report getReport() {
		Map<String,String> myReport = new HashMap<String, String>();
		myReport.put("Account Number", ""+getAccountNumber()+"");
		myReport.put("Account Type", ""+getType());
		myReport.put("*******Transactions********", "");
		Report report = new Report(myReport);
		
		ReportComputer reportComputer = new ReportComputer();
		transactionManger.computeReport(this, reportComputer);
		report.addChildReport(reportComputer.getReport());
		return report;
	}

	@Override
	public String getExpiryDate() {
		// TODO Auto-generated method stub
		return expiryDate;
	}
	@Override
	public double computeInterest() {
		return getCurrentBalance()*monthlyInterest;
	}

}
