package finance;

import java.util.ArrayList;
import java.util.List;


import finance.view.CRModel;
import framework.entities.AbstractFactory;
import framework.entities.Address;
import framework.entities.Customer;
import framework.entities.Person;
import framework.entities.Transaction;
import framework.interfaces.IAccount;
import framework.interfaces.ICustomer;
import framework.interfaces.ICustomerManager;
import framework.interfaces.IDataSet;
import framework.reporting.IReportComputer;

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
