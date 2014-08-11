package com.finance.ui.view;

import java.util.Vector;

import javax.swing.JButton;

public abstract class AbstractMainView {

	private JButton reportButton;
	private IUIFactory uiFactory;

	public AbstractMainView() {
		uiFactory = new DefaultUIFactory();
	}

	public AbstractDynamicPanel getCRPanel() {
		return uiFactory.createCRPanel();
	}

	public AbstractDynamicPanel getTRPanel() {
		return uiFactory.createTRPanel();
	}

	public void setUIFactory(IUIFactory uiFactory) {
		this.uiFactory = uiFactory;
	}
	
	public abstract void setTableModel(Vector vector);
}
