package com.banknp.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.demoapp.entities.AccountManager;
import com.finance.entities.AbstractAccountManager;
import com.finance.interfaces.IAccount;
import com.finance.reporting.Report;

public class BankAccountManager extends AccountManager {
	
	private List<IAccount> accounts = new ArrayList<IAccount>();
	

	
	public void addAccount(IAccount account){
		accounts.add(account);
	}
	
	public IAccount findAccount(int account_no) {
		for (IAccount account : accounts) {
			if (account.getAccountNumber() == account_no) {
				return account;
			}
		}
		return null;
	}

	@Override
	public List<IAccount> getAllAccounts() {
		// TODO Auto-generated method stub
		return accounts;
	}

	
	
}
