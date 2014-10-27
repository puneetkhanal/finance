package com.finance;

import java.util.ArrayList;
import java.util.List;

import com.finance.framework.entities.AbstractFactory;
import com.finance.framework.entities.Address;
import com.finance.framework.entities.Customer;
import com.finance.framework.entities.Person;
import com.finance.framework.entities.Transaction;
import com.finance.framework.intefaces.IAccount;
import com.finance.framework.intefaces.ICustomer;
import com.finance.framework.intefaces.ICustomerManager;
import com.finance.framework.intefaces.IDataSet;
import com.finance.framework.reporting.IReportComputer;
import com.finance.view.CRModel;



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
