package reporting;

import java.util.ArrayList;
import java.util.HashMap;

public class Report {
	private HashMap<String, String > myReport = new HashMap<String, String>();
	private ArrayList<Report> childReport = new ArrayList<Report>();
	
	public void addChilReport(Report r){
		childReport.add(r);
	}
	//public String

}
