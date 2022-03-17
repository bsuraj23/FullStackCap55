package overriding;

class Parent1{
	protected void display() {
		System.out.println("Protected Parent1 display");
	}
}

class Child1 extends Parent1{
	protected void display() {
		System.out.println("Protected Child2 display");
	}
}

public class ProtectedOverridingExample {

	public static void main(String[] args) {
		Parent1 p1 = new Child1();
		p1.display();
	}

}
