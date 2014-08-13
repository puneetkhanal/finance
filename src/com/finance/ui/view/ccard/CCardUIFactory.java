package com.finance.ui.view.ccard;

import javax.swing.JButton;

import com.finance.ui.view.AbstractDynamicPanel;
import com.finance.ui.view.IUIFactory;
import com.finance.view.defaultview.DefaultTRPanel;

public class CCardUIFactory implements IUIFactory {

	@Override
	public AbstractDynamicPanel createCRPanel() {
		return new CCardCRPanel();
	}

	@Override
	public AbstractDynamicPanel createTRPanel() {
		return new DefaultTRPanel();
	}

	@Override
	public JButton createReportButton() {
		return new JButton("Generate Monthly Bills");
	}

}
