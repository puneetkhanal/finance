package com.demoapp.entities;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.views.AbstractView;

import com.finance.entities.AbstractFactory;
import com.finance.entities.Account;
import com.finance.entities.Customer;
import com.finance.entities.IDataSet;
import com.finance.entities.Transaction;
import com.finance.interfaces.IAbstractFactory;
import com.finance.interfaces.IAccountManager;
import com.finance.interfaces.ICustomer;
import com.finance.interfaces.ICustomerManager;
import com.finance.reporting.IReportComputer;
import com.finance.ui.view.CRForm;

public class DefaultFactory extends AbstractFactory{

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
	public List<IDataSet> getDataSet(ICustomerManager customerManager) {
		List<IDataSet> list = new ArrayList<IDataSet>();
		for(ICustomer c:customerManager.getAllCustomer()){
			for(Account a:c.getAllAccount()){
				list.add(new DataSet(c, a));
			}
		}
		return list;
	}

	@Override
	public Customer createCustomer(CRForm form, String customerType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account createAccount(CRForm form, ICustomer customer,
			String accountType) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
