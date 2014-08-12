package com.finance.entities;

import java.util.List;

import com.finance.entities.Account;
import com.finance.entities.Transaction;

public interface ICustomer {
	public boolean addAccount(Account account);
	public boolean removeAccount(Account account);
	public boolean sendEmail(Transaction transaction,Account account);
	public boolean checkEmailSendingCondition(Transaction transaction);
	public List<Account> getAccounts();
}
