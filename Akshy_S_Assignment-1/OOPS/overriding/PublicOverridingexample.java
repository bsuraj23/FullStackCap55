package overriding;

class Parent{
	public void display() {
		System.out.println("Public Parent display");
	}
}

class Child extends Parent{
	public void display() {
		System.out.println("Public Child display");
	}
}

public class PublicOverridingexample {

	public static void main(String[] args) {
		Parent p = new Child();
		p.display();

	}

}
