package overriding;

class Soe{
	static void display() {
		System.out.println("Soe static display");
	}
}
public class StaticOverridingExample extends Soe{
	public void display() {
		System.out.println("StaticOverridingExample display");
	}
	public static void main(String[] args) {
		Soe s = new StaticOverridingExample();
		s.display();

	}

}
