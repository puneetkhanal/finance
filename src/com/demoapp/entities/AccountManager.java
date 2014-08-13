package com.demoapp.entities;

import java.util.ArrayList;
import java.util.List;

import com.finance.entities.AbstractAccountManager;
import com.finance.interfaces.IAccount;
import com.finance.reporting.Report;

public class AccountManager extends AbstractAccountManager{

	private List<IAccount> accounts = new ArrayList<IAccount>();

	public void addAccount(IAccount account) {
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

	


}