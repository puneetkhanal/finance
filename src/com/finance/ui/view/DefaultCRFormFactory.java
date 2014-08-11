package com.finance.ui.view;

public class DefaultCRFormFactory implements ICRFormFactory {

	@Override
	public CRForm createCRForm() {
		return new CRForm();
	}

}
