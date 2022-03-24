package com.march16.exceptions;

public class IndexOutofBond {
	public static void main(String[] args) {
		try {
			int arr[]= {1,2,3,4,5};
			System.out.println(arr[21]);
		}
		//catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println("Array Boundary");
			
		//} 
		catch(Exception g) {
			System.out.println(g);
			
		}

	}
}
