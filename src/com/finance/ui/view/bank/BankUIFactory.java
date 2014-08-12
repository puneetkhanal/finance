package com.finance.ui.view.bank;

import javax.swing.JButton;

import com.finance.ui.view.AbstractDynamicPanel;
import com.finance.ui.view.IUIFactory;

public class BankUIFactory implements IUIFactory{

	@Override
	public AbstractDynamicPanel createCRPanel() {
		return new BankCRPanel();
	}

	@Override
	public AbstractDynamicPanel createTRPanel() {
		return new BankTRPanel();
	}

	@Override
	public JButton createReportButton() {
		return new JButton("Generate Report");
	}

}
