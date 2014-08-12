package com.finance.ui.view;

public class TRForm {

	@Override
	public String toString() {
		return "TRForm [name=" + name + ", amount=" + amount + "]";
	}

	private String name;
	private double amount;

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
