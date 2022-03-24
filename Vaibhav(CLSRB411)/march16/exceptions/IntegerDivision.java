package com.march16.exceptions;

import java.util.*;

public class IntegerDivision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		
		try {
			int total =a/0;
			System.out.println("execution Will not come here ");
		}
		catch(ArithmeticException  e) {
			System.out.println("Cannot divid a number by zero");
			
		}
		sc.close();

	}
}
