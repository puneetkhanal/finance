package com.finance.ui.view;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

public class AbstractDynamicPanel {

	private List<JButton> buttons;

	public AbstractDynamicPanel() {
		buttons = new ArrayList<JButton>();
	}

	public void addButtion(JButton button) {
		buttons.add(button);
	}

	public void addActionListener(ActionListener actionListener) {
		for (JButton button : buttons) {
			button.addActionListener(actionListener);
		}
	}
}
