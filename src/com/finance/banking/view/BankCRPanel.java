package com.finance.banking.view;

import com.finance.framework.view.AbstractDynamicPanel;
import com.finance.framework.view.TypedJButton;

public class BankCRPanel extends AbstractDynamicPanel {

	public BankCRPanel() {
		this.addButton(new TypedJButton("Add personal account", "personal"));
		this.addButton(new TypedJButton("Add company account", "company"));
	}

}
