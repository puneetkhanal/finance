package com.finance.ui.view.bank;

import com.finance.ui.view.CRForm;

public class PersonalForm extends CRForm {

	private String birthDate;
	private AccountType accountType;

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

}
