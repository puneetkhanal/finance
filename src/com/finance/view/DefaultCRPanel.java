package com.finance.view;

import com.finance.framework.view.AbstractDynamicPanel;
import com.finance.framework.view.TypedJButton;

public class DefaultCRPanel extends AbstractDynamicPanel {

	public DefaultCRPanel() {
		TypedJButton button = new TypedJButton("Add customer","addcustomer");
		this.add(button);
		this.addButton(button);
	}
}
