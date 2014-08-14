package credit;


import framework.entities.Transaction;
import framework.reporting.IReportComputer;
import framework.reporting.Report;

public class ReportComputer implements IReportComputer<Report, Transaction> {
	private Report report;
	@Override
	public void compute(Transaction t) {
		
	}
	@Override
	public Report getReport() {
		return report;
	}
	
}
