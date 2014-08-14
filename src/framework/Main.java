package framework;

import credit.CreditAccountManager;
import credit.CreditApplicationFactory;
import credit.CreditCustomerManager;
import credit.CreditTransactionManager;
import creditcard.view.CCardCRFormFactory;
import creditcard.view.CCardMainView;
import creditcard.view.CCardUIFactory;
import banking.BankAccountManager;
import banking.BankCustomerManager;
import banking.BankFactory;
import banking.BankTransactionManager;
import banking.view.BankCRFactory;
import banking.view.BankMainView;
import banking.view.BankUIFactory;



import finance.AccountManager;
import finance.CustomerManager;
import finance.DefaultFactory;
import finance.TransactionManager;
import finance.view.CRModel;
import finance.view.DefaultCRDialogFactory;
import finance.view.DefaultMainView;
import finance.view.DefaultUIFactory;
import framework.controllers.FrameworkController;
import framework.interfaces.IAbstractFactory;
import framework.interfaces.IAccountManager;
import framework.interfaces.ICustomerManager;
import framework.interfaces.ITransactionManager;
import framework.view.MainView;
import framework.view.controller.UIController;

public class Main {
	public static void main(String[] args) {
		// Logic Injection
		System.out.println("Hello Framework");

//		finance();
//		 bank();
		 credit();

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