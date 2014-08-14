package framework.entities;

import finance.Utils;
import framework.interfaces.IAccount;

public abstract class Transaction {
	private String date;
	protected double amount;
	private String name;
	protected IAccount account;
	
	public Transaction(IAccount account,Double amount, String name) {
		super();
		this.account =account;
		this.date = Utils.getDate();
		this.amount = amount;
		this.name = name;
		
	}
	public Double getAmount(){
		return amount;
	}
	public void execute(){
		account.addBalance(amount);
		account.notifyCustomer(this);
	}
	@Override
	public String toString(){
		return "*********************Trasnsaction***************"+"\n"+
				"  "+"acount number:"+account.getAccountNumber()+"\n"+
				"  "+"         type: "+getType()+"\n"+
				"  "+"amount added :"+amount;
	}
	
	public abstract String getType();
		
	public String getDate(){
		return date;
	}
	
	public IAccount getAccount(){
		return account;
	}
}
