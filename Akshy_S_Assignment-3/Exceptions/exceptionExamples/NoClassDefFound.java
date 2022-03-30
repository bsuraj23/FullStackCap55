package exceptionExamples;

public class NoClassDefFound {

	public static void main(String[] args) {
		try {
			ClassA a = new ClassA();
			a.display();
		}catch(NoClassDefFoundError e ) {
			System.out.println("Class definition not found");
		}

	}

}
