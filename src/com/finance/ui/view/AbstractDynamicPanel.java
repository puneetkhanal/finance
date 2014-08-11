package com.finance.ui.view;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

public class AbstractDynamicPanel extends JPanel {

	private List<JButton> buttons;

	public AbstractDynamicPanel() {
		buttons = new ArrayList<JButton>();
		for(JButton button:buttons){
			this.add(button);
		}
	}

	public void addButton(JButton button) {
		buttons.add(button);
	}

	public void addActionListener(ActionListener actionListener) {
		for (JButton button : buttons) {
			button.addActionListener(actionListener);
		}
	}
}
