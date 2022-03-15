package package1;

import java.util.Scanner;

public class SwitchPattern {
	
	
	 static void rightPattern(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	 
	 static void leftPattern(int n) {
		 int i,j;
			for(i=0;i<n;i++) {
				for(j=2*(n-i);j>=0;j--)
				{
					System.out.print(" ");
				}
				for(j=0;j<=i;j++) {
					
					System.out.print("* ");
				}
				System.out.println();
				
			}

	 }
	 
	 static void fullPattern(int n) {
		 int i,j;
			for(i=0;i<n;i++) {
				for(j=n-i;j>1;j--) {
					System.out.print(" ");
				}
				for(j=0;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			
	 }

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your choice :");
	int choice=sc.nextInt();
	switch(choice) {
	
	case 1:
		rightPattern(5);
		break;
		
	case 2:
		leftPattern(5);
		break;
		
	case 3:
		fullPattern(5);
		break;
		
	default :
		System.out.println("Invalid input!");
		break;
	}
	
	}

}
