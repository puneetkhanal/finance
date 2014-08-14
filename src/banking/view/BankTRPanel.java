package banking.view;


import finance.view.DefaultTRPanel;
import framework.view.TypedJButton;

public class BankTRPanel extends DefaultTRPanel {

	public BankTRPanel() {
		this.addButton(new TypedJButton("Add interest","addinterest"));
	}
}
