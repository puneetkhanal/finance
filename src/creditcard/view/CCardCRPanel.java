package creditcard.view;

import framework.view.AbstractDynamicPanel;
import framework.view.TypedJButton;

public class CCardCRPanel extends AbstractDynamicPanel {

	public CCardCRPanel() {
		this.addButton(new TypedJButton("Add credit card account","ccard"));
	}

}
