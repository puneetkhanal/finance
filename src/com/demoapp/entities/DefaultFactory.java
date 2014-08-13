package com.demoapp.entities;

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
import com.finance.view.defaultview.CRModel;

public class DefaultFactory extends AbstractFactory{

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
				list.add(new DataSet(c, a));
			}
		}
		return list;
	}

	@Override
	public Customer createCustomer(CRModel form, String customerType) {
		String name = form.getName();
		String email = form.getEmail();
		String street = form.getStreet();
		String city = form.getCity();
		String state = form.getState();
		String zipCode= form.getZip();
		Address address =new Address(street, city, zipCode, state);
		return new Person(address, name, email,"");
	}

	@Override
	public IAccount createAccount(CRModel form, ICustomer customer,
			String accountType) {
		//process the form for any field required to create the account, 
		//in this case the application itself generates the account number
		return new Account(customer);
	}

	@Override
	public Transaction getTransaction(IAccount account, double amount,
			String type) {
		if(type.equals("deposit")){
			return new Deposit(account, amount, "");
		}
		else{
			return new Withdrawal(account, amount, "");
		}
	}

	

}
