package framework.interfaces;

import java.util.List;


import framework.controllers.FrameworkController;

public interface IAccountManager {
	
	public void addAccount(IAccount account);
	public IAccount findAccount(int account_no);
	public List<IAccount> getAllAccounts();
	public void setAccountChanged() ;
	public void setFrameworkController(FrameworkController frameworkController);
}
