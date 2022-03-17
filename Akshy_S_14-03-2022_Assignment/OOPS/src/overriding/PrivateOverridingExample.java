package overriding;

class Parent3{
	private void display() {
		System.out.println("Private Parent3 display");
	}
}

class Child3 extends Parent3{
	public void display() {
		System.out.println("Private Child3 display");
	}
}

public class PrivateOverridingExample {
	public static void main(String[] args) {
		Parent3 p3 = new Child3();
		p3.display();//Cannot override private method.
	}
}
