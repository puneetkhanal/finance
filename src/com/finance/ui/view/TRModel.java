package com.finance.ui.view;

public class TRModel {

	private String transactionType;

	@Override
	public String toString() {
		return "TRForm [name=" + name + ", amount=" + amount + "]";
	}

	private String name;
	private double amount;

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
