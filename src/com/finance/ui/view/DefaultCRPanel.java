package com.finance.ui.view;

public class DefaultCRPanel extends AbstractDynamicPanel {

	public DefaultCRPanel() {
		TypedJButton button = new TypedJButton("addcustomer","Add customer");
		this.add(button);
		this.addButton(button);
	}
}
