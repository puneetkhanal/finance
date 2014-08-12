package com.finance.ui.view;

public class DefaultTRPanel extends AbstractDynamicPanel {

	public DefaultTRPanel() {

		TypedJButton button = new TypedJButton("Deposit","deposit");

		TypedJButton withdraw = new TypedJButton("Withdraw","withdraw");
		this.add(button);
		this.addButton(button);
		this.add(withdraw);
		this.addButton(withdraw);
	}
}
