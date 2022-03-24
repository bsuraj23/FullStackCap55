package com.march14;

import java.util.*;

public class Star {
	public void FullStar(int row){
		for (int i=1; i<=row; i++) 
        { 
           
            for (int j=row; j>i; j--)
            {
                System.out.print(" ");
            }
         
            for (int k=1; k<=(i * 2) -1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
		
	}
	public void LeftStar(int row) {
		for (int i=1; i<=row; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
		
	}
	public void RightStar(int row) {
		for (int i=1; i<=row; i++) 
        { 
            for (int j=row; j>i; j--)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row:");
		int row=sc.nextInt();
		Star star=new Star();
		star.FullStar(row);
		star.LeftStar(row);
		star.RightStar(row);
		sc.close();
	}
}
