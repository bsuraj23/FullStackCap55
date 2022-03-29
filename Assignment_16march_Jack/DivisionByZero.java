package capg.training;

public class DivisionByZero {

	public static void main(String[] args) {
		
		
		try {
			int result=8/0;
			System.out.println("not executed");
		}
		catch(ArithmeticException  e) {
			System.out.println("Cannot divid  by zero");
			
		}

	}

}
