package com.finance.framework.reporting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Report {
	
	private Map<String,String> myReport = new HashMap<String, String>();
	private List<Report> childReports = new ArrayList<Report>();
	
	
	public Report(Map<String, String> myReport) {
		super();
		this.myReport = myReport;
	}


	public void addChildReport(Report childReport){
		childReports.add(childReport);
	}


	public Map<String, String> getMyReport() {
		return myReport;
	}


	public void setMyReport(Map<String, String> myReport) {
		this.myReport = myReport;
	}
	
	public String getString(String padding){
		String result ="";
		if(myReport!=null){
			Iterator<String> iterator = myReport.keySet().iterator();
			while(iterator.hasNext()){
				String key = iterator.next();
				String value = myReport.get(key);
				result += padding+key+":"+value+"\n";
			}
		}
		for(Report r: childReports){
			result+="\n";
			result +=r.getString(padding+"  ");
		}
		return result;
	}
	
	
}
