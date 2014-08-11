package com.finance.ui.view;

import javax.swing.JButton;

public class DefaultTRPanel extends AbstractDynamicPanel {

	public DefaultTRPanel() {
		JButton button = new JButton("Deposit");

		JButton withdraw = new JButton("Withdraw");
		this.add(button);
		this.addButton(button);
		this.add(withdraw);
		this.addButton(withdraw);
	}
}
