package com.banknp.entities;

import java.util.ArrayList;
import java.util.List;

import com.finance.entities.AbstractFactory;
import com.finance.entities.Address;
import com.finance.entities.Customer;
import com.finance.entities.Person;
import com.finance.entities.Transaction;
import com.finance.interfaces.IAccount;
import com.finance.interfaces.ICustomer;
import com.finance.interfaces.ICustomerManager;
import com.finance.interfaces.IDataSet;
import com.finance.reporting.IReportComputer;
import com.finance.ui.view.CRForm;

public class BankFactory extends AbstractFactory{

	@Override
	public IReportComputer getReportComputer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IDataSet> getDataSet(ICustomerManager customerManager) {
		List<IDataSet> list = new ArrayList<IDataSet>();
		for(ICustomer c:customerManager.getAllCustomer()){
			for(IAccount a:c.getAllAccount()){
				list.add(new BankDataSet(c, a));
			}
		}
		return list;
	}

	@Override
	public Customer createCustomer(CRForm form, String customerType) {
		String name = form.getName();
		String email = form.getEmail();
		String street = form.getStreet();
		String city = form.getCity();
		String state = form.getState();
		String zipCode= form.getZip();
		Address address =new Address(street, city, zipCode, state);
		return new Person(address, name, email);
	}

	@Override
	public IAccount createAccount(CRForm form, ICustomer customer,
			String accountType) {
		//process the form for any field required to create the account, 
		//in this case the application itself generates the account number
		if(accountType.equals(BankInformation.CHECKING));
		return new CheckingAccount(customer);
	}

	@Override
	public Transaction getTransaction(IAccount account, double amount,
			String type) {
		if(type.equals("deposit")){
			return new BankDeposit(account, amount, "");
		}
		else{
			return new BankWithdrawal(account, amount, "");
		}
	}

	

}
