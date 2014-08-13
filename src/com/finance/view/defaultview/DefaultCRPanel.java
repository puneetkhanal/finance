package com.finance.view.defaultview;

import com.finance.ui.view.AbstractDynamicPanel;
import com.finance.ui.view.TypedJButton;

public class DefaultCRPanel extends AbstractDynamicPanel {

	public DefaultCRPanel() {
		TypedJButton button = new TypedJButton("Add customer","addcustomer");
		this.add(button);
		this.addButton(button);
	}
}
