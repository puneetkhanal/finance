package banking;


import framework.entities.Transaction;
import framework.interfaces.IAccount;

public class AddInterest extends Transaction{

	public AddInterest(IAccount account, Double amount, String name) {
		super(account, amount, name);
	}

	@Override
	public String getType() {
		return "interest";
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		super.execute();
		account.setChanged();
	}

}
