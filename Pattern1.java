package com.org.patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		row=sc.nextInt();
		System.out.println("Here is your pattern...!");
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}

}
//ENOCK HARRIS SUHAS F