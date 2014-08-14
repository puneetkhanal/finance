package banking.view;

import framework.view.AbstractDynamicPanel;
import framework.view.TypedJButton;

public class BankCRPanel extends AbstractDynamicPanel {

	public BankCRPanel() {
		this.addButton(new TypedJButton("Add personal account", "personal"));
		this.addButton(new TypedJButton("Add company account", "company"));
	}

}
