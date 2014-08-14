package creditcard.view;

import finance.view.CRModel;

public class CCardCRModel extends CRModel {

	private int ccNumber;
	private String expDate;
	private CCAccountType ccAccountType;

	public CCAccountType getCcAccountType() {
		return ccAccountType;
	}

	public void setCcAccountType(CCAccountType ccAccountType) {
		this.ccAccountType = ccAccountType;
	}

	public int getCcNumber() {
		return ccNumber;
	}

	public void setCcNumber(int ccNumber) {
		this.ccNumber = ccNumber;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

}
