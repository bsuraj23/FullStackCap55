package assignmentMar16;

public class arrayIndexOutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[]= {1,2,3,4,5};
			System.out.println(arr[21]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index is out of the boundary");
		} 
//		catch(Exception g) {
//			System.out.println(g);
//			
//		}
	}
}