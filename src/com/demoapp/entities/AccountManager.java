package com.demoapp.entities;

import java.util.ArrayList;
import java.util.List;

import com.finance.entities.AbstractAccountManager;
import com.finance.interfaces.IAccount;

public class AccountManager extends AbstractAccountManager {
	
	private List<IAccount> accounts = new ArrayList<IAccount>();
	
	public void addAccount(IAccount account){
		accounts.add(account);
		account.setAccountManager(this);
	}
	
	public IAccount findAccount(int account_no){
		return null;
	}

	
	
}
