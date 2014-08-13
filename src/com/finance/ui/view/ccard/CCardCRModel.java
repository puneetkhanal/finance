package com.finance.ui.view.ccard;

import com.finance.ui.view.CRModel;

public class CCardCRModel extends CRModel {

	private String ccNumber;
	private String expDate;
	private CCAccountType ccAccountType;

	public CCAccountType getCcAccountType() {
		return ccAccountType;
	}

	public void setCcAccountType(CCAccountType ccAccountType) {
		this.ccAccountType = ccAccountType;
	}

	public String getCcNumber() {
		return ccNumber;
	}

	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

}
