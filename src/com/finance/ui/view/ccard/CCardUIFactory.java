package com.finance.ui.view.ccard;

import com.finance.ui.view.AbstractDynamicPanel;
import com.finance.ui.view.DefaultTRPanel;
import com.finance.ui.view.IUIFactory;

public class CCardUIFactory implements IUIFactory{

	@Override
	public AbstractDynamicPanel createCRPanel() {
		return new CCardCRPanel();
	}

	@Override
	public AbstractDynamicPanel createTRPanel() {
		return new DefaultTRPanel();
	}

}
