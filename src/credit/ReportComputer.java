package credit;


import java.util.HashMap;
import java.util.Map;

import framework.entities.Transaction;
import framework.reporting.IReportComputer;
import framework.reporting.Report;

public class ReportComputer implements IReportComputer<Report, Transaction> {
	private Report report;
	
	public ReportComputer() {
		report = new Report(null);
	}
	@Override
	public void compute(Transaction t) {
		Map<String,String> transactionMap = new HashMap<String, String>();
		transactionMap.put("Date", t.getDate());
		transactionMap.put("Type", t.getType());
		transactionMap.put("Amount",""+ t.getAmount()+"");
		Report local = new Report(transactionMap);
		report.addChildReport(local);
	}
	@Override
	public Report getReport() {
		return report;
	}
	
}
