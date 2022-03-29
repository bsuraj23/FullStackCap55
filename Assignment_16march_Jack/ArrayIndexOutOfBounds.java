package capg.training;




public class ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		
		try {
			int arr[]= {1,2,3,4,5,6,7,8,9,10};
			System.out.println(arr[45]);
		}
		
		catch(Exception g) {
			System.out.println(g);
			
		}

	}

}
