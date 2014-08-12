package com.finance.interfaces;

import com.finance.controllers.FrameworkController;

public interface IAccountManager {
	
	public void addAccount(IAccount account);
	public IAccount findAccount(int account_no);
	public void setChanged() ;
	public void setFrameworkController(FrameworkController frameworkController);
}
