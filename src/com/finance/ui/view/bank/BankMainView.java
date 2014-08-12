package com.finance.ui.view.bank;

import java.util.Vector;

import javax.swing.UIManager;

import com.finance.ui.controller.UIController;
import com.finance.ui.view.AbstractMainView;
import com.finance.ui.view.IUIFactory;

public class BankMainView extends AbstractMainView {

	public BankMainView(String title, IUIFactory iuiFactory) {
		super(title, iuiFactory);
		columnNames = new Vector<String>();
		columnNames.add("Street");
		columnNames.add("City");
		columnNames.add("State");
		columnNames.add("Zip");
		columnNames.add("P/C");
		columnNames.add("Ch/s");
		columnNames.add("Amount");

		setTableModel(new Vector());
	}

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
			AbstractMainView mainView = new BankMainView("Bank application",
					new BankUIFactory());
			new UIController(mainView, new BankCRFactory());
			mainView.setVisible(true);
		} catch (Throwable t) {
			t.printStackTrace();
			// Ensure the application exits with an error condition.
			System.exit(1);
		}
	}
}
