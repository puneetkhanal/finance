package com.finance.framework.entities;

import java.util.HashMap;
import java.util.Map;

import com.finance.framework.intefaces.IAccount;
import com.finance.framework.reporting.Report;




public class Person extends Customer   {
	private String dob;
	public Person(Address address, String name, String email, String dob) {
		super(address, name, email);
		this.dob = dob;
		
	}

	@Override
	public boolean checkEmailSendingCondition(Transaction transaction) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Person";
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
