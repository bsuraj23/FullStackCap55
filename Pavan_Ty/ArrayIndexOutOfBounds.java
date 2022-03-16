package com.arraylist;


public class ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[]= {2,3,4,5,6,7,8};
			System.out.println(arr[10]);
		}
	
		catch(Exception e) {
			System.out.println(e);
			
		}

	}

}
