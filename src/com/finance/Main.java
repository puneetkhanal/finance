package com.finance;

import com.banknp.entities.BankAccountManager;
import com.banknp.entities.BankCustomerManager;
import com.banknp.entities.BankFactory;
import com.banknp.entities.BankTransactionManager;
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
import com.finance.ui.view.MainView;
import com.finance.ui.view.bank.BankCRFactory;
import com.finance.ui.view.bank.BankMainView;
import com.finance.ui.view.bank.BankUIFactory;
import com.finance.ui.view.ccard.CCardCRFormFactory;
import com.finance.ui.view.ccard.CCardMainView;
import com.finance.ui.view.ccard.CCardUIFactory;
import com.finance.view.defaultview.CRModel;
import com.finance.view.defaultview.DefaultCRDialogFactory;
import com.finance.view.defaultview.DefaultMainView;
import com.finance.view.defaultview.DefaultUIFactory;

public class Main {
	public static void main(String[] args) {
		// Logic Injection
		System.out.println("Hello Framework");

//		finance();
		 bank();
		// credit();

	}

	public static void finance() {
		//Default
		ICustomerManager customerManager = new CustomerManager();
		ITransactionManager transactionManager = new TransactionManager();
		IAccountManager accountManager = new AccountManager();
		IAbstractFactory myFactory = new DefaultFactory();
		
		
		FrameworkController frameworkController = new FrameworkController(null);
		frameworkController.injectServiceProviders(customerManager,
				accountManager, transactionManager, myFactory);

		MainView mainView = new DefaultMainView("Finance Application",
				new DefaultUIFactory());
		UIController uiController = new UIController(mainView,
				new DefaultCRDialogFactory());

		frameworkController.setUIController(uiController);
		uiController.setFrameWorkcontroller(frameworkController);

		CRModel crModel=getCrModel("Puneet", "Fairfield", "puneetkhanal@gmail.com", "fairfield", "1000 N", "52556");
		uiController.registerCustomer(crModel);
		
		mainView.setVisible(true);
	}

	private static CRModel getCrModel(String name, String city, String email,
			String state, String street, String zip) {
		CRModel crModel = new CRModel();
		crModel.setName(name);
		crModel.setCity(city);
		crModel.setEmail(email);
		crModel.setState(state);
		crModel.setStreet(street);
		crModel.setZip(zip);
		return crModel;
	}

	public static void bank() {
		ICustomerManager customerManager = new BankCustomerManager();
		ITransactionManager transactionManager = new BankTransactionManager();
		IAccountManager accountManager = new BankAccountManager();
		IAbstractFactory myFactory = new BankFactory();

		FrameworkController frameworkController = new FrameworkController(null);
		frameworkController.injectServiceProviders(customerManager,
				accountManager, transactionManager, myFactory);

		MainView mainView = new BankMainView("Bank Application",
				new BankUIFactory());
		UIController uiController = new UIController(mainView,
				new BankCRFactory());

		frameworkController.setUIController(uiController);
		uiController.setFrameWorkcontroller(frameworkController);

		mainView.setVisible(true);
	}

	public static void credit() {
		ICustomerManager customerManager = new CustomerManager();
		ITransactionManager transactionManager = new TransactionManager();
		IAccountManager accountManager = new AccountManager();
		IAbstractFactory myFactory = new DefaultFactory();

		FrameworkController frameworkController = new FrameworkController(null);
		frameworkController.injectServiceProviders(customerManager,
				accountManager, transactionManager, myFactory);

		MainView mainView = new CCardMainView("Credit Card Application",
				new CCardUIFactory());
		UIController uiController = new UIController(mainView,
				new CCardCRFormFactory());

		frameworkController.setUIController(uiController);
		uiController.setFrameWorkcontroller(frameworkController);

		mainView.setVisible(true);
	}
}
