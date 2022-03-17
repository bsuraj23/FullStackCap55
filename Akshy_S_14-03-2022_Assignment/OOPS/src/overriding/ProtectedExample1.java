package overriding;
import overriding1.ProtectedClass;
public class ProtectedExample1 extends ProtectedClass {
	protected void display() {
		System.out.println("Protected from overriding");
	}
	public static void main(String[] args) {
		ProtectedClass pc = new ProtectedExample1();
		pc.display();// Cannot override Protected method in another package.
	}

}
