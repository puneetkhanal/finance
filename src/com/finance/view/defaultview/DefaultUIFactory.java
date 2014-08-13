package com.finance.view.defaultview;

import javax.swing.JButton;

import com.finance.ui.view.AbstractDynamicPanel;
import com.finance.ui.view.IUIFactory;

public class DefaultUIFactory implements IUIFactory {

	@Override
	public AbstractDynamicPanel createCRPanel() {
		return new DefaultCRPanel();
	}

	@Override
	public AbstractDynamicPanel createTRPanel() {
		return new DefaultTRPanel();
	}

	@Override
	public JButton createReportButton() {
		return new JButton("Generate Report");
	}

}
