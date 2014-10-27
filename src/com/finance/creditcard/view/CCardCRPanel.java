package com.finance.creditcard.view;

import com.finance.framework.view.AbstractDynamicPanel;
import com.finance.framework.view.TypedJButton;

public class CCardCRPanel extends AbstractDynamicPanel {

	public CCardCRPanel() {
		this.addButton(new TypedJButton("Add credit card account","ccard"));
	}

}
