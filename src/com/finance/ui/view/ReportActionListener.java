package com.finance.ui.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReportActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		ReportView reportView=new ReportView();
		reportView.show();
		
	}

}
