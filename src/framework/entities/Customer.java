package framework.entities;

import java.util.ArrayList;
import java.util.List;

import framework.interfaces.IAccount;
import framework.interfaces.ICustomer;

public abstract class Customer implements ICustomer{
	private Address address;
	private String name;
	private String email;
	
	private List<IAccount> accounts = new ArrayList<IAccount>();
	

	public Customer(Address address, String name, String email) {
		super();
		this.address = address;
		this.name = name;
		this.email = email;
	}
	
	@Override
	public boolean addAccount(IAccount account) {
		accounts.add(account);
		return true;
	}
	
	@Override
	public boolean removeAccount(IAccount account) {
		return accounts.remove(account);
	}
	
	@Override
	public List<IAccount> getAllAccount() {
		return accounts;
	}
	
	@Override
	public boolean sendEmail(Transaction transaction, IAccount account) {
		
		return false;
	}
	@Override
	public abstract boolean checkEmailSendingCondition(Transaction transaction); 
	@Override
	public abstract String getType();

	@Override
	public Address getAddress() {
		return address;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getEmail() {
		return email;
	}
	
	

}
