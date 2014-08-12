package com.finance.entities;

import java.util.HashMap;
import java.util.Map;

import com.finance.reporting.Report;

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

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Organisation";
	}

	@Override
	public Report getReport() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Name", getName());
		map.put("customer type", getType());
		Report myReport = new Report(map);
		for(Account a: getAllAccount()){
			myReport.addChildReport(a.getReport());
		}
		return myReport;
	}

}
