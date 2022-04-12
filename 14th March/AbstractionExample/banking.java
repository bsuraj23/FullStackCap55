package Abstraction;

abstract class bank{
	int getLoan() {
		return 100;
	}
	abstract int getInterest();
}

class bank1 extends bank{
	int getInterest() {
		return 10;
	}
}

class bank2 extends bank{
	int getInterest() {
		return 11;
	}
}

public class banking {
	public static void main(String[] agrs) {
		bank b = new bank1();
		System.out.println(b.getInterest());
		System.out.println(b.getLoan());
	}

}
