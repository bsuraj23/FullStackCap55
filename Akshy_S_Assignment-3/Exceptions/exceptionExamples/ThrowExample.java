package exceptionExamples;

class Division{
	public int div(int[] a)throws ArithmeticException, ArrayIndexOutOfBoundsException {
		return a[0]/a[2];
	}
}


public class ThrowExample {

	public static void main(String[] args) {
		int[] a = {5,0};
		Division d = new Division();
		try {
			System.out.println(d.div(a));
		}
		catch(ArithmeticException e) {
			throw new ArithmeticException("Never divide by zero"); 
		}
		catch(ArrayIndexOutOfBoundsException e) {
			throw new ArrayIndexOutOfBoundsException("Accessing element out of range");
		}
	}

}
