package finance.view;

import javax.swing.BoxLayout;

import framework.view.AbstractDynamicPanel;
import framework.view.TypedJButton;

public class DefaultTRPanel extends AbstractDynamicPanel {

	public DefaultTRPanel() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		TypedJButton button = new TypedJButton("Deposit", "deposit");

		TypedJButton withdraw = new TypedJButton("Withdraw", "withdraw");
		this.add(button);
		this.addButton(button);
		this.add(withdraw);
		this.addButton(withdraw);
	}
}
