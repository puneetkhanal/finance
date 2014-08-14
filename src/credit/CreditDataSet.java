package credit;

import java.util.Vector;

import framework.interfaces.IAccount;
import framework.interfaces.ICustomer;
import framework.interfaces.IDataSet;


public class CreditDataSet implements IDataSet<Integer>{
    public ICustomer customer;
    public IAccount account;
	
    
	public CreditDataSet(ICustomer customer, IAccount account) {
		super();
		this.customer = customer;
		this.account = account;
	}

	@Override
	public Vector<String> toVector() {
		 Vector<String> newRow = new Vector<String>();
	        newRow.add(customer.getName());
	        //newRow.add(customer.getType());
	        newRow.add(""+account.getAccountNumber()+"");
	        newRow.add(account.getExpiryDate());
	        newRow.add(account.getType());
	        newRow.add(""+account.getCurrentBalance()+"");
	        return newRow;
	}

	@Override
	public Integer getData() {
		return account.getAccountNumber();
	}

}
