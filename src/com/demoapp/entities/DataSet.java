package com.demoapp.entities;

import java.util.Vector;

import com.finance.entities.Account;
import com.finance.entities.Customer;
import com.finance.entities.IDataSet;
import com.finance.interfaces.ICustomer;


public class DataSet implements IDataSet<Integer>{
    public ICustomer customer;
    public Account account;
	
    
	public DataSet(ICustomer customer, Account account) {
		super();
		this.customer = customer;
		this.account = account;
	}

	@Override
	public Vector<String> toVector() {
		 Vector<String> newRow = new Vector<String>();
	        newRow.add(customer.getName());
	        newRow.add(customer.getType());
	        newRow.add(""+account.getAccountNumber()+"");
	        newRow.add(account.getType());
	        newRow.add(""+account.getCurrentBalance()+"");
	        return newRow;
	}

	@Override
	public Integer getData() {
		return account.getAccountNumber();
	}

}
