package com.finance.reporting;

public interface IReportComputer<R,T> {
	public void compute(T t);
	public R getReport();
}
