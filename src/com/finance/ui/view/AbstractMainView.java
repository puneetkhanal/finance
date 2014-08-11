package com.finance.ui.view;

import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;

public abstract class AbstractMainView extends JFrame {

	private JButton reportButton;
	private IUIFactory uiFactory;
	private AbstractDynamicPanel crPanel;
	private AbstractDynamicPanel trPanel;

	public AbstractMainView() {
		uiFactory = new DefaultUIFactory();
		crPanel = uiFactory.createCRPanel();
		trPanel = uiFactory.createTRPanel();
	}

	public AbstractDynamicPanel getCRPanel() {
		return crPanel;
	}

	public AbstractDynamicPanel getTRPanel() {
		return trPanel;
	}

	public void setUIFactory(IUIFactory uiFactory) {
		this.uiFactory = uiFactory;
	}

	public JButton getReportButton() {
		return reportButton;
	}

	public abstract void setTableModel(Vector vector);
}
