package com.finance.ui.view.ccard;

import java.util.Vector;

import javax.swing.UIManager;

import com.finance.ui.controller.UIController;
import com.finance.ui.view.AbstractMainView;
import com.finance.ui.view.IUIFactory;

public class CCardMainView extends AbstractMainView {

	public CCardMainView(String title, IUIFactory iuiFactory) {
		super(title, iuiFactory);
		columnNames = new Vector<String>();
		columnNames.add("Name");
		columnNames.add("CCnumber");
		columnNames.add("Exp Date");
		columnNames.add("Type");
		columnNames.add("Balance");

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
			AbstractMainView mainView = new CCardMainView(
					"Credit card application", new CCardUIFactory());
			new UIController(mainView, new CCardCRFormFactory());
			mainView.setVisible(true);
		} catch (Throwable t) {
			t.printStackTrace();
			// Ensure the application exits with an error condition.
			System.exit(1);
		}
	}

}
