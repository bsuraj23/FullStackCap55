package assignmentMar16;

public class divisionByZero extends Exception{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int division=6/0;
			//int division=6/2;
			System.out.println("No error "+division);
		}
		catch(ArithmeticException  e) {
			System.out.println("Cannot divid a number by zero");	
		}
	}
}
