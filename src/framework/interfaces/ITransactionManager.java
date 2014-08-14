package framework.interfaces;


import creditcard.ReportComputer;
import framework.entities.Transaction;
import framework.reporting.Report;

public interface ITransactionManager {

	public void addTransaction(Transaction transaction);
	public void addTransactionTemplate(Transaction transaction);
	public void computeReport(IAccount account,ReportComputer reportComputer);
	public Report getReport();
}
