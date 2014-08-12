package com.banknp.entities;

import java.util.Vector;

import com.finance.interfaces.IAccount;
import com.finance.interfaces.ICustomer;
import com.finance.interfaces.IDataSet;


public class BankDataSet implements IDataSet<Integer>{
    public ICustomer customer;
    public IAccount account;
	
    
	public BankDataSet(ICustomer customer, IAccount account) {
		super();
		this.customer = customer;
		this.account = account;
	}

	@Override
	public Vector<String> toVector() {
		 Vector<String> newRow = new Vector<String>();
	        newRow.add(customer.getName());
	        //newRow.add(customer.getType());
	        newRow.add(""+account.getAccountNumber()+"");
	        //newRow.add(account.getType());
	        newRow.add(""+account.getCurrentBalance()+"");
	        return newRow;
	}

	@Override
	public Integer getData() {
		return account.getAccountNumber();
	}

}
