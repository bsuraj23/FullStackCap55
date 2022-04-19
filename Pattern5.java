package com.org.patterns;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row values");
		rows=sc.nextInt();
		
		System.out.println("Here is your pattern...!");
		 for (int i= 1; i<= rows; i++)
	        {
			 for (int j=0; j<rows-i; j++)
	            
	               System.out.print(" ");
	            
	            for (int k=0;k<i;k++)
	            {
	                System.out.print("*");  //if we give space we'll get a triangle

	            } 
	         System.out.println();
		}
		sc.close();
	}

}

//ENOCK HARRIS SUHAS F