package userDefinedException;

public class InsufficientFundException extends Exception{
	private double amount;
	InsufficientFundException(double amount){
		this.amount = amount;
	}
	public double getAmount() {
		return amount;
	}

}
