package com.finance.framework.view;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

public class AbstractDynamicPanel extends JPanel {

	private List<TypedJButton> buttons;

	public AbstractDynamicPanel() {
		buttons = new ArrayList<TypedJButton>();
		for(JButton button:buttons){
			this.add(button);
		}
	}

	public void addButton(TypedJButton button) {
		this.add(button);
		buttons.add(button);
	}

	public void addActionListener(ActionListener actionListener) {
		for (JButton button : buttons) {
			button.addActionListener(actionListener);
		}
	}
}
