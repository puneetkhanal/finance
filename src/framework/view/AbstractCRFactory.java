package framework.view;

import javax.swing.JDialog;

import framework.view.controller.RegistrationActionListener;
import framework.view.controller.UIController;

public abstract class AbstractCRFactory {

	protected UIController uiController;

	public AbstractCRFactory() {

	}
	
	public abstract JDialog createCRDialog(String type,RegistrationActionListener listener);
}
