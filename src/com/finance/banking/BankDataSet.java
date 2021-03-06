package com.finance.banking;

import java.util.Vector;

import com.finance.framework.intefaces.IAccount;
import com.finance.framework.intefaces.ICustomer;
import com.finance.framework.intefaces.IDataSet;



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
	        newRow.add(customer.getAddress().street);
	        newRow.add(customer.getAddress().city);
	        newRow.add(customer.getAddress().state);
	        newRow.add(customer.getAddress().zipCode);
	        String type = customer.getType();
	        newRow.add(""+type.charAt(0)+"");
	        type = account.getType();
	        newRow.add(""+type.charAt(0)+"");
	        //newRow.add(customer.getType());
	        //newRow.add(""+account.getAccountNumber()+"");
	        //newRow.add(account.getType());
	        newRow.add(""+account.getCurrentBalance()+"");
	        return newRow;
	}

	@Override
	public Integer getData() {
		return account.getAccountNumber();
	}

}
