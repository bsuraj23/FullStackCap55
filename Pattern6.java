package com.org.patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		n=sc.nextInt();
		System.out.println("Here is your pattern...!");
		//Outer Loop for number of Rows
	      for(int i=0;i<n;i++)
	      {
	          for(int k=i;k<n;k++)
	          System.out.print(" ");
	 
	          // printing '*' in each column.
	          for(int j=0;j<=i;j++)
	          {
	            // We print '*' for each row.
	            System.out.print("* ");
	          }
	 
	          System.out.println();
	      }
		sc.close();
	}

}

//ENOCK HARRIS SUHAS F