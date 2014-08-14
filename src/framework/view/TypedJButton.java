package framework.view;

import javax.swing.JButton;

public class TypedJButton extends JButton {

	private String type;

	public TypedJButton(String label, String type) {
		this.type = type;
		this.setText(label);
	}

	public String getType() {
		return type;
	}
}
