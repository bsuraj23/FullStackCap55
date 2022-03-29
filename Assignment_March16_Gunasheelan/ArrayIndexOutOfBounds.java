package com.arrays;

public class ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[]= {5,4,3,2,1};
			System.out.println(arr[20]);
		}
		//catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println("Array Index not found");
			
		//} 
		catch(Exception e) {
			System.out.println(e);
			
		}

	}

}
