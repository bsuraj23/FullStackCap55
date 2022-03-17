package overriding;

class Foe{
	final void display() {
		System.out.println("Foe Final display");
	}
}

public class FinalOverridingExample extends Foe{
	//Cannot override Final method
	public void display() {
		System.out.println("FinalOverridingExample display");
	}
	public static void main(String[] args) {
		Foe e = new FinalOverrideExample();
		e.display();

	}

}
