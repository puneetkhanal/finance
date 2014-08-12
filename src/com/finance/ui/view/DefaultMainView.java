package com.finance.ui.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;
import javax.swing.*;

import com.finance.ui.controller.UIController;

/**
 * A basic JFC based application.
 */
public class DefaultMainView extends AbstractMainView {
	private JTable table;
	private UIController controller;
	private Vector<String> columnNames;

	public DefaultMainView() {
		columnNames = new Vector<String>();
		columnNames.addElement("Name");
		columnNames.addElement("State");
		columnNames.addElement("City");
		columnNames.addElement("Street");

		Vector<String> rowOne = new Vector<String>();
		rowOne.add("Puneet");
		rowOne.add("Iowa");
		rowOne.add("Fairfield");
		rowOne.add("1000N street");

		Vector<Vector> rowData = new Vector<Vector>();
		rowData.add(rowOne);
		table = new JTable(new Vector<String>(), columnNames);
		DefaultTableModel model = new DefaultTableModel(rowData, columnNames);

		table.setModel(model);
		table.setPreferredScrollableViewportSize(new Dimension(400, 100));
		table.setFillsViewportHeight(true);
		JScrollPane scrollPane = new JScrollPane(table);
		this.getContentPane().add(scrollPane);
		controller = new UIController(this);

	}

	/*****************************************************
	 * The entry point for this application. Sets the Look and Feel to the
	 * System Look and Feel. Creates a new JFrame1 and makes it visible.
	 *****************************************************/
	static public void main(String args[]) {
		try {
			// Add the following code if you want the Look and Feel
			// to be set to the Look and Feel of the native system.

			try {
				UIManager.setLookAndFeel(UIManager
						.getSystemLookAndFeelClassName());
			} catch (Exception e) {
			}

			// Create a new instance of our application's frame, and make it
			// visible.
			(new DefaultMainView()).setVisible(true);
		} catch (Throwable t) {
			t.printStackTrace();
			// Ensure the application exits with an error condition.
			System.exit(1);
		}
	}

	javax.swing.JPanel JPanel1 = new javax.swing.JPanel();
	javax.swing.JButton JButton_PerAC = new javax.swing.JButton();
	javax.swing.JButton JButton_CompAC = new javax.swing.JButton();
	javax.swing.JButton JButton_Deposit = new javax.swing.JButton();
	javax.swing.JButton JButton_Withdraw = new javax.swing.JButton();
	javax.swing.JButton JButton_Addinterest = new javax.swing.JButton();
	javax.swing.JButton JButton_Exit = new javax.swing.JButton();

	void exitApplication() {
		try {
			this.setVisible(false); // hide the Frame
			this.dispose(); // free the system resources
			System.exit(0); // close the application
		} catch (Exception e) {
		}
	}

	class SymWindow extends java.awt.event.WindowAdapter {
		@Override
		public void windowClosing(java.awt.event.WindowEvent event) {
			Object object = event.getSource();
			if (object == DefaultMainView.this)
				BankFrm_windowClosing(event);
		}
	}

	void BankFrm_windowClosing(java.awt.event.WindowEvent event) {
		// to do: code goes here.

		BankFrm_windowClosing_Interaction1(event);
	}

	void BankFrm_windowClosing_Interaction1(java.awt.event.WindowEvent event) {
		try {
			this.exitApplication();
		} catch (Exception e) {
		}
	}

	@Override
	public void setTableModel(Vector<Vector> data) {
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		table.setModel(model);
	}

}
