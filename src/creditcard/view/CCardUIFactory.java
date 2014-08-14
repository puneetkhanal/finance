package creditcard.view;

import javax.swing.JButton;

import banking.view.BankTRPanel;

import finance.view.DefaultTRPanel;
import framework.view.AbstractDynamicPanel;
import framework.view.IUIFactory;

public class CCardUIFactory implements IUIFactory {

	@Override
	public AbstractDynamicPanel createCRPanel() {
		return new CCardCRPanel();
	}

	@Override
	public AbstractDynamicPanel createTRPanel() {
		return new BankTRPanel();
	}

	@Override
	public JButton createReportButton() {
		return new JButton("Generate Monthly Bills");
	}

}
