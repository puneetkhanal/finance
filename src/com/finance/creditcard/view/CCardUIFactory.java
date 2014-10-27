package com.finance.creditcard.view;

import javax.swing.JButton;

import com.finance.banking.view.BankTRPanel;
import com.finance.framework.view.AbstractDynamicPanel;
import com.finance.framework.view.IUIFactory;



public class CCardUIFactory implements IUIFactory {

	@Override
	public AbstractDynamicPanel createCRPanel() {
		return new CCardCRPanel();
	}

	@Override
	public AbstractDynamicPanel createTRPanel() {
		return new BankTRPanel();
	}

	@Override
	public JButton createReportButton() {
		return new JButton("Generate Monthly Bills");
	}

}
