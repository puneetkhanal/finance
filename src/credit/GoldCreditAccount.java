package credit;

import java.util.HashMap;
import java.util.Map;

import framework.entities.AbstractAccount;
import framework.interfaces.ICustomer;
import framework.reporting.Report;

public class GoldCreditAccount extends AbstractAccount{

	public GoldCreditAccount(int acc_no, ICustomer customer) {
		super(acc_no, customer);
	}

	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "gold";
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
	public double computeInterest() {
		// TODO Auto-generated method stub
		return 0;
	}

}
