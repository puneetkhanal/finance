package creditcard.view;

import javax.swing.JDialog;


import framework.view.AbstractCRFactory;
import framework.view.controller.RegistrationActionListener;

public class CCardCRFormFactory extends AbstractCRFactory {

	public CCardCRFormFactory() {
	}

	@Override
	public JDialog createCRDialog(String type,RegistrationActionListener listener) {
		return new CCardCRDialog(listener);
	}

}
