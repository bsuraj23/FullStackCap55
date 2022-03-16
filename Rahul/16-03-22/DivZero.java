package com.selfstudy;

public class DivZero {

	public static void main(String[] args) {

		try {
			int total=20/0;
			System.out.println("No Execution");
		}
		catch(ArithmeticException  e) {
			System.out.println("Cannot Divide a Number by Zero");
		}
	}
}