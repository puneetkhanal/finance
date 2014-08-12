package com.demoapp.entities;

import java.util.ArrayList;
import java.util.List;

import com.finance.controllers.FrameworkController;
import com.finance.entities.AbstractAccountManager;
import com.finance.entities.Account;
import com.finance.interfaces.IAccountManager;

public class AccountManager extends AbstractAccountManager {

	private List<Account> accounts = new ArrayList<Account>();

	public void addAccount(Account account) {
		accounts.add(account);
		account.setAccountManger(this);
	}

	public Account findAccount(int account_no) {
		for (Account account : accounts) {
			if (account.getAccountNumber() == account_no) {
				return account;
			}
		}
		return null;
	}

}
