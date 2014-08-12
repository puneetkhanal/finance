package com.finance.ui.view;

public class DefaultUIFactory implements IUIFactory {

	@Override
	public AbstractDynamicPanel createCRPanel() {
		return new DefaultCRPanel();
	}

	@Override
	public AbstractDynamicPanel createTRPanel() {
		return new DefaultTRPanel();
	}

}
