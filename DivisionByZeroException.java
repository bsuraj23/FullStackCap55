
public class DivisionByZeroException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int total=2/0;
			System.out.println("division ");
		}
		catch(ArithmeticException  e) {
			System.out.println("Cannot divid  by zero");
			
		}

}
