package com.selfstudy;

public class OutofBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[]= {1,2,3,4,5,6,7};
			System.out.println(arr[10]);
		}

		catch(Exception e) {
			System.out.println(e);

		}

	}

}