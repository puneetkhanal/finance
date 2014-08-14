package framework.view;

import javax.swing.JButton;


public interface IUIFactory {

	public AbstractDynamicPanel createCRPanel();
	public AbstractDynamicPanel createTRPanel();
	public JButton createReportButton();
	
}
