public class Sample {

	public static void main(String[] args) {

		// call the method add by supplying value
		int result = add(10, 20);
		
		System.out.println("Sum returned =" + result);
	}

	public static int add(int first, int second) {
		// use parameter to find sum
		int sum = first + second;

		return sum;// return the sum
	}

}