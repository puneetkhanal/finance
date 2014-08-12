package com.finance.controllers;

import java.util.ArrayList;
import java.util.List;

import com.finance.entities.Account;

public class AccountManager {
	private List<Account> accounts = new ArrayList<Account>();
	
	public void addAccount(Account account){
		accounts.add(account);
	}
	
	public Account findAccount(int account_no){
		return null;
	}

}
