package com.finance.view.defaultview;

import javax.swing.BoxLayout;

import com.finance.ui.view.AbstractDynamicPanel;
import com.finance.ui.view.TypedJButton;

public class DefaultTRPanel extends AbstractDynamicPanel {

	public DefaultTRPanel() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		TypedJButton button = new TypedJButton("Deposit", "deposit");

		TypedJButton withdraw = new TypedJButton("Withdraw", "withdraw");
		this.add(button);
		this.addButton(button);
		this.add(withdraw);
		this.addButton(withdraw);
	}
}
