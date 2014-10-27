package com.finance.framework.entities;

import com.finance.framework.intefaces.IAccount;
import com.finance.framework.intefaces.IAccountManager;
import com.finance.framework.intefaces.ICustomer;
import com.finance.framework.intefaces.ITransactionManager;


public abstract class AbstractAccount implements IAccount{
	
	private static int accountNumberGenerator = 123456;
	private int accountNumber;
	private double currentBalance;
	protected ICustomer customer;
	protected IAccountManager accountManager;
	protected ITransactionManager transactionManger;
	
	public AbstractAccount(int acc_no, ICustomer customer) {
		super();
		this.accountNumber = acc_no;
		this.customer = customer;	
	}
	
	public AbstractAccount(ICustomer customer){
		this.customer = customer;	
		accountNumber = accountNumberGenerator;
		accountNumberGenerator++;
		
	}
	
	@Override
	public final void setManagers(IAccountManager accountManger,ITransactionManager transactionManager){
		this.accountManager = accountManger;
		this.transactionManger = transactionManager;
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
		accountManager.setAccountChanged();
	}
	@Override
	public String getExpiryDate() {
		// TODO Auto-generated method stub
		return null;
	}
}
