package exceptionExamples;

public class ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		try {
			System.out.println(a[10]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array out of bounds");
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}
