package com.finance.ui.view.bank;

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

}
