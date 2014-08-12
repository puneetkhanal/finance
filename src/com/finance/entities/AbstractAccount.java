package com.finance.entities;

import com.finance.interfaces.IAccount;
import com.finance.interfaces.IAccountManager;
import com.finance.interfaces.ICustomer;


public abstract class AbstractAccount implements IAccount{
	
	private static int accountNumberGenerator = 123456;
	private double interestRate;
	private int accountNumber;
	private double currentBalance;
	private ICustomer customer;
	private IAccountManager accountManager;
	
	public AbstractAccount(int acc_no, ICustomer customer) {
		super();
		this.accountNumber = acc_no;
		this.customer = customer;	
	}
	
	public AbstractAccount(ICustomer customer){
		this.customer = customer;	
		accountNumber = accountNumberGenerator;
		accountNumberGenerator++;
		interestRate = getInterestRate();
	}
	@Override
	public final void setAccountManager(IAccountManager accountManger){
		this.accountManager = accountManger;
	}
	@Override
	public final void addBalance(double amount){
		currentBalance+=amount;
	}
	@Override
	public final int getAccountNumber() {
		return accountNumber;
	}
	@Override
	public final double getCurrentBalance() {
		return currentBalance;
	}
	@Override
	public final ICustomer getCustomer() {
		return customer;
	}
	@Override
	public final void notifyCustomer(Transaction transaction){
		customer.sendEmail(transaction, this);
	}
	@Override
	public final  void setChanged(){
		accountManager.setChanged();
	}
}
