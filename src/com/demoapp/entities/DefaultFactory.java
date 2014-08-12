package com.demoapp.entities;

import com.finance.controllers.CustomerManager;
import com.finance.entities.AbstractFactory;
import com.finance.entities.Account;
import com.finance.entities.Customer;
import com.finance.entities.DataSet;
import com.finance.entities.Transaction;
import com.finance.reporting.IReportComputer;
import com.finance.ui.view.CRForm;

public class DefaultFactory implements AbstractFactory{

	@Override
	public IReportComputer getReportComputer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transaction getTransaction(Account account, double amount,
			String type) {
		if(type.equals("deposit")){
			return new Deposit(account, amount, "");
		}
		else{
			return new Withdrawal(account, amount, "");
		}
	}

	@Override
	public Customer getCustomer(CRForm form, String type) {
		String name = form.getName();
		String email = form.getEmail();
		String street = form.getStreet();
		String city = form.getCity();
		String state = form.getState();
		//
		return null;
	}

	@Override
	public Account getAccount(CRForm form, Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataSet getDataSet(CustomerManager customerManager) {
		// TODO Auto-generated method stub
		return null;
	}

}
