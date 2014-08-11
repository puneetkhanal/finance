package com.finance.entities;

import java.util.Date;

public abstract class Transaction {
	private Date date;
	protected Double amount;
	private String name;
	protected Account account;
	
	public Transaction(Account account,Double amount, String name) {
		super();
		this.account =account;
		this.date = new Date();
		this.amount = amount;
		this.name = name;
		
	}
	public Double getAmount(){
		return amount;
	}
	public void execute(){
		account.addBalance(amount);
	}
	public String toString(){
		return "*********************Trasnsaction***************"+"\n"+
				"  "+"acount number:"+account.getAccountNumber()+"\n"+
				"  "+"         type: "+getType()+"\n"+
				"  "+"amount added :"+amount;
	}
	
	public abstract String getType();
		
	
}
