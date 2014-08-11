package com.finance.entities;

import com.finance.reporting.IReportComputer;

public interface AbstractFactory {
	public IReportComputer getReportComputer();
}
