package exceptionExamples;

public class Arthmetic {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e){
			System.out.println("Division by zero not possible");
		}
		System.out.println("Step1");
		System.out.println("Step2");
		System.out.println("Step3");
	}

}
