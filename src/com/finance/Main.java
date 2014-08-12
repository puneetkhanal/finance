package com.finance;


import com.demoapp.entities.AccountManager;
import com.demoapp.entities.CustomerManager;
import com.demoapp.entities.DefaultFactory;
import com.demoapp.entities.TransactionManager;
import com.finance.controllers.FrameworkController;
import com.finance.interfaces.IAbstractFactory;
import com.finance.interfaces.IAccountManager;
import com.finance.interfaces.ICustomerManager;
import com.finance.interfaces.ITransactionManager;
import com.finance.ui.controller.UIController;
import com.finance.ui.view.AbstractMainView;
import com.finance.ui.view.DefaultCRDialogFactory;
import com.finance.ui.view.DefaultMainView;
import com.finance.ui.view.DefaultUIFactory;

public class Main {
	public static void main(String[] args){
		//Logic Injection
		System.out.println("Hello Framework");
		
		ICustomerManager customerManager = new CustomerManager();
		ITransactionManager transactionManager = new TransactionManager();
		IAccountManager accountManager = new AccountManager();
		IAbstractFactory  myFactory = new DefaultFactory();
		
		FrameworkController frameworkController = new FrameworkController(null);
		frameworkController.injectServiceProviders(customerManager, accountManager, transactionManager, myFactory);
		
		
		AbstractMainView mainView=new DefaultMainView("Finance Application", new DefaultUIFactory(), null);
		UIController uiController =new UIController(mainView, new DefaultCRDialogFactory());
		
		frameworkController.setUIController(uiController);
		uiController.setFrameWorkcontroller(frameworkController);
		
		mainView.pack();
		mainView.setVisible(true);
		
	}
}
