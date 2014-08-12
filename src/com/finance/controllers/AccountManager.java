package com.finance.controllers;

import java.util.ArrayList;
import java.util.List;

import com.finance.entities.Account;

public class AccountManager {
	private FrameworkController frameworkController;
	private List<Account> accounts = new ArrayList<Account>();
	
	
	public AccountManager(FrameworkController frameworkController) {
		super();
		this.frameworkController = frameworkController;
	}

	public void addAccount(Account account){
		accounts.add(account);
		account.setAccountManger(this);
	}
	
	public Account findAccount(int account_no){
		return null;
	}

	public void setChanged() {
		frameworkController.dataSetChanged();
	}

}
