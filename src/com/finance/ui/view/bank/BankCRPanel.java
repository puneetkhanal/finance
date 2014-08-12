package com.finance.ui.view.bank;

import com.finance.ui.view.AbstractDynamicPanel;
import com.finance.ui.view.TypedJButton;

public class BankCRPanel extends AbstractDynamicPanel {

	public BankCRPanel() {
		this.addButton(new TypedJButton("Add personal account", "personal"));
		this.addButton(new TypedJButton("Add company account", "company"));
	}

}
