package userDefinedException;

public class BankDemo {

	public static void main(String[] args) {
		CheckingAccount c = new CheckingAccount(121);
		System.out.println("Depositing Rs 1000");
		c.deposit(1000);
		try {
			System.out.println("\nWithdrawing Rs 600");
			c.withdraw(600);
			System.out.println("\nWithdrawing Rs 800");
			c.withdraw(800);
		}
		catch(InsufficientFundException e) {
			System.out.println("\nInsufficient fund.\nYou need more: Rs "+e.getAmount());
		}
	}

}
