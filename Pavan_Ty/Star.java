package com.starprograms;


import java.util.Scanner;
class Stars{
	 void FullStar(int row){
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
	 void LeftStar(int row) {
		for (int i=1; i<=row; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}
	 void RightStar(int row) {
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

}
class Main{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		Stars star=new Stars();
		star.FullStar(row);
		star.LeftStar(row);
		star.RightStar(row);

	}
}
