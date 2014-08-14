package finance.view;

import javax.swing.JDialog;


import framework.view.AbstractCRFactory;
import framework.view.controller.RegistrationActionListener;

public class DefaultCRDialogFactory extends AbstractCRFactory {

	public DefaultCRDialogFactory() {
		super();
	}

	@Override
	public JDialog createCRDialog(String type,RegistrationActionListener listener) {
		JDialog crDialog = new CRDialog(listener);
		crDialog.setBounds(450, 20, 300, 330);
		return crDialog;
	}

}
