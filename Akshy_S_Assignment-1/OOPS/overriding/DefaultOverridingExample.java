package overriding;

interface Parent2{
	default void display() {
		System.out.println("Default Parent2 display");
	}
}

class Child2 implements Parent2{
	 public void display() {
		System.out.println("Default Child2 display");
	}
}


public class DefaultOverridingExample {

	public static void main(String[] args) {
		Child2 p2 = new Child2();
		p2.display();
	}

}
