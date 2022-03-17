package march16;

public class DivisionByZero {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			try {
				int total=5/2;
				System.out.println("This cannot be executed ");
			}
			catch(ArithmeticException  e) {
				System.out.println("Cannot divide a number by zero");
				
			}

		}

}
