
public class divisionByZero {
	public static void main(String[] args) {
		try {
			int total=6/0;
			System.out.println("execution Will not come here ");
		}
		catch(ArithmeticException  e) {
			System.out.println("Cannot divid a number by zero");
			
		}

	}


}
