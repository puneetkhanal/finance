package com.finance.interfaces;

import java.util.List;

import com.finance.controllers.FrameworkController;
import com.finance.reporting.Report;

public interface IAccountManager {
	
	public void addAccount(IAccount account);
	public IAccount findAccount(int account_no);
	public List<IAccount> getAllAccounts();
	public void setAccountChanged() ;
	public void setFrameworkController(FrameworkController frameworkController);
}
