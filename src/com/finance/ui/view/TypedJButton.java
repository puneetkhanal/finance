package com.finance.ui.view;

import javax.swing.JButton;

public class TypedJButton extends JButton {

	private String type;

	public TypedJButton(String type, String label) {
		this.type = type;
		this.setText(label);
	}

	public String getType() {
		return type;
	}
}
