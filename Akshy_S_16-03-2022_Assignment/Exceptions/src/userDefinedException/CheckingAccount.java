package userDefinedException;

public class CheckingAccount {
	private int id;
	private double balance;
	CheckingAccount(int id){
		this.id = id;
	}
	public void deposit(double amount) {
		balance+=amount;
	}
	public void withdraw(double amount) throws InsufficientFundException{
		if(amount<=balance) {
			balance-=amount;
		}
		else {
			double needs = amount-balance;
			throw new InsufficientFundException(needs);
		}
	}
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
}
