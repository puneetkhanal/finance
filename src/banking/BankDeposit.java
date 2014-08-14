package banking;


import framework.entities.Transaction;
import framework.interfaces.IAccount;

public class BankDeposit extends Transaction {

	public BankDeposit(IAccount account, Double amount, String name) {
		super(account, amount, name);
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Deposit";
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		super.execute();
		account.setChanged();
	}

}
