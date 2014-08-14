package finance.view;

import framework.view.AbstractDynamicPanel;
import framework.view.TypedJButton;

public class DefaultCRPanel extends AbstractDynamicPanel {

	public DefaultCRPanel() {
		TypedJButton button = new TypedJButton("Add customer","addcustomer");
		this.add(button);
		this.addButton(button);
	}
}
