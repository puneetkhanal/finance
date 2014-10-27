package com.finance.banking.view;


import com.finance.framework.view.TypedJButton;
import com.finance.view.DefaultTRPanel;


public class BankTRPanel extends DefaultTRPanel {

	public BankTRPanel() {
		this.addButton(new TypedJButton("Add interest","addinterest"));
	}
}
