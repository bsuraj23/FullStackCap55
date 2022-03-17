package overriding;

class s{
	public void display() {
		System.out.println("Class s display");
	}
}
public class SuperExample extends s {
	public void display() {
		super.display();
		System.out.println("SuperExample display");
	}
	public static void main(String[] args) {
		SuperExample se = new SuperExample();
		se.display();

	}

}
