package com.finance.ui.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public abstract class AbstractMainView extends JFrame {

	private JButton reportButton;
	private IUIFactory uiFactory;
	private AbstractDynamicPanel crPanel;
	private AbstractDynamicPanel trPanel;

	public AbstractMainView() {
		uiFactory = new DefaultUIFactory();
		crPanel = uiFactory.createCRPanel();
		trPanel = uiFactory.createTRPanel();
		setTitle("Finance Application.");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(new FlowLayout());
		setSize(575, 310);
		setVisible(false);
		JPanel operationsPanel=new JPanel();
		operationsPanel.setSize(500, 10);
		operationsPanel.setLayout(
				new BoxLayout(operationsPanel, BoxLayout.X_AXIS));
		operationsPanel.add(crPanel);
		operationsPanel.add(trPanel);
//		operationsPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.getContentPane().add(operationsPanel);
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

	public abstract void setTableModel(Vector<Vector> data);
}
