package Assigment16Mar;

public class Array_exception {
	
	public static void main(String[] args) {
		try {
			int[] arr= {1,3,5,7};
			System.out.println(arr[21]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exceeding array boundary");
		}
		catch(Exception e)
		{
			System.out.println("Other exception");
		}

	}

}
