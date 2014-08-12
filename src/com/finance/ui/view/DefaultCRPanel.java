package com.finance.ui.view;

public class DefaultCRPanel extends AbstractDynamicPanel {

	public DefaultCRPanel() {
		TypedJButton button = new TypedJButton("Add customer","addcustomer");
		this.add(button);
		this.addButton(button);
	}
}
