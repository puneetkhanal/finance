package com.banknp.entities;

import java.util.ArrayList;
import java.util.List;

import com.finance.entities.AbstractFactory;
import com.finance.entities.Address;
import com.finance.entities.Customer;
import com.finance.entities.Organisation;
import com.finance.entities.Person;
import com.finance.entities.Transaction;
import com.finance.interfaces.IAccount;
import com.finance.interfaces.ICustomer;
import com.finance.interfaces.ICustomerManager;
import com.finance.interfaces.IDataSet;
import com.finance.reporting.IReportComputer;
import com.finance.ui.view.bank.CompanyModel;
import com.finance.ui.view.bank.PersonalModel;
import com.finance.view.defaultview.CRModel;

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
	public Customer createCustomer(CRModel form, String customerType) {
		String name = form.getName();
		String email = form.getEmail();
		String street = form.getStreet();
		String city = form.getCity();
		String state = form.getState();
		String zipCode= form.getZip();
		Address address =new Address(street, city, zipCode, state);
		if(form instanceof PersonalModel){
			PersonalModel personalModel = (PersonalModel)form;
			String dateOfBirth = personalModel.getBirthDate();
			return new Person(address, name, email,dateOfBirth);
		}
		else{
			CompanyModel companyModel = (CompanyModel) form;
			int numEmployee = companyModel.getNumberOfEmployees();
			return new Organisation(address, name, email, numEmployee);
		}
	}

	@Override
	public IAccount createAccount(CRModel form, ICustomer customer,
			String accountType) {
		//process the form for any field required to create the account, 
		//in this case the application itself generates the account number
		if(accountType.equals(BankInformation.CHECKING))
		return new CheckingAccount(customer,1.16);
		if(accountType.equals(BankInformation.SAVING))
		return new SavingAccount(customer,1.16);
		return null;
		
	}

	@Override
	public Transaction getTransaction(IAccount account, double amount,
			String type) {
		if(type.equals("deposit")){
			return new BankDeposit(account, amount, "");
		}
		else if(type.equals("addinterest")){
			return new AddInterest(account, amount, "");
		}
		else{
			return new BankWithdrawal(account, amount, "");
		}
	}

	

}
