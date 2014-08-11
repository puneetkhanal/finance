package com.finance.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer implements ICustomer{
	private Address address;
	private String name;
	private String email;
	
	private List<Account> accounts = new ArrayList<Account>();
	

	public Customer(Address address, String name, String email) {
		super();
		this.address = address;
		this.name = name;
		this.email = email;
	}
	
	@Override
	public boolean addAccount(Account account) {
		accounts.add(account);
		return true;
	}
	
	@Override
	public boolean removeAccount(Account account) {
		return accounts.remove(account);
	}
	
	@Override
	public List<Account> getAccounts() {
		return accounts;
	}
	
	@Override
	public boolean sendEmail(Transaction transaction, Account account) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public abstract boolean checkEmailSendingCondition(Transaction transaction); 

}
