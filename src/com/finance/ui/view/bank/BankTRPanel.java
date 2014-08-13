package com.finance.ui.view.bank;

import com.finance.ui.view.TypedJButton;
import com.finance.view.defaultview.DefaultTRPanel;

public class BankTRPanel extends DefaultTRPanel {

	public BankTRPanel() {
		this.addButton(new TypedJButton("Add interest","addinterest"));
	}
}
