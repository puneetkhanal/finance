package com.finance.framework;

import com.finance.AccountManager;
import com.finance.CustomerManager;
import com.finance.DefaultFactory;
import com.finance.TransactionManager;
import com.finance.banking.BankAccountManager;
import com.finance.banking.BankCustomerManager;
import com.finance.banking.BankFactory;
import com.finance.banking.BankTransactionManager;
import com.finance.banking.view.BankCRFactory;
import com.finance.banking.view.BankMainView;
import com.finance.banking.view.BankUIFactory;
import com.finance.creditcard.CreditAccountManager;
import com.finance.creditcard.CreditApplicationFactory;
import com.finance.creditcard.CreditCustomerManager;
import com.finance.creditcard.CreditTransactionManager;
import com.finance.creditcard.view.CCardCRFormFactory;
import com.finance.creditcard.view.CCardMainView;
import com.finance.creditcard.view.CCardUIFactory;
import com.finance.framework.controllers.FrameworkController;
import com.finance.framework.intefaces.IAbstractFactory;
import com.finance.framework.intefaces.IAccountManager;
import com.finance.framework.intefaces.ICustomerManager;
import com.finance.framework.intefaces.ITransactionManager;
import com.finance.framework.view.MainView;
import com.finance.framework.view.controller.UIController;
import com.finance.view.CRModel;
import com.finance.view.DefaultCRDialogFactory;
import com.finance.view.DefaultMainView;
import com.finance.view.DefaultUIFactory;



public class Main {
	public static void main(String[] args) {
		// Logic Injection
		System.out.println("Hello Framework");
//
//		finance();
//		 bank();
		 credit();

	}

	public static void finance() {
		// Default
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

		CRModel crModel = getCrModel("Puneet", "Fairfield",
				"puneetkhanal@gmail.com", "fairfield", "1000 N", "52556");
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
		ICustomerManager customerManager = new CreditCustomerManager();
		ITransactionManager transactionManager = new CreditTransactionManager();
		IAccountManager accountManager = new CreditAccountManager();
		IAbstractFactory myFactory = new CreditApplicationFactory();

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
