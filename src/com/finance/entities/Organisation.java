package com.finance.entities;

import java.util.HashMap;
import java.util.Map;

import com.finance.interfaces.IAccount;
import com.finance.reporting.Report;

public class Organisation extends Customer{
	private int numberOfEmployee;
	public Organisation(Address address, String name, String email,int numEmployee) {
		super(address, name, email);
		this.numberOfEmployee = numEmployee;
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
		map.put("Customer Type", getType());
		Report myReport = new Report(map);
		for(IAccount a: getAllAccount()){
			myReport.addChildReport(a.getReport());
		}
		return myReport;
	}

}
