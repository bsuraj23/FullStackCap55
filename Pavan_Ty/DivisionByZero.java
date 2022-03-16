package com.arraylist;

public class DivisionByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int total=20/0;
			System.out.println("execution Will not come here ");
		}
		catch(ArithmeticException  e) {
			System.out.println("Cannot divide a number by zero");
			
		}

	}

}
