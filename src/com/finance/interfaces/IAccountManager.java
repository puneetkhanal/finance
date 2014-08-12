package com.finance.interfaces;

import com.finance.controllers.FrameworkController;
import com.finance.entities.Account;

public interface IAccountManager {
	
	public void addAccount(Account account);
	public Account findAccount(int account_no);
	public void setChanged() ;
	public void setFrameworkController(FrameworkController frameworkController);
}
