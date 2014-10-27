package com.finance.banking;

import java.util.ArrayList;
import java.util.List;

import com.finance.AccountManager;
import com.finance.framework.intefaces.IAccount;


public class BankAccountManager extends AccountManager {
	
	private List<IAccount> accounts = new ArrayList<IAccount>();
	

	
	@Override
	public void addAccount(IAccount account){
		accounts.add(account);
	}
	
	@Override
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
