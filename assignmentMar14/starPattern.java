package assignmentMar14;

import java.util.Scanner;

public class starPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice= 1-Full Star 2-Left Star 3-Right Star");
		int choice=sc.nextInt();
		System.out.println("Enter number of rows: ");
		int rows=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			int i, space, j;
		      for(i=0; i<rows; i++)
		      {
		         for(space=i; space<rows; space++)
		            System.out.print(" ");
		         for(j=0; j<(i+1); j++)
		            System.out.print("* ");
		         System.out.print("\n");
		      }
		      break;
		      
		case 2:

			int  a, b;
		      for(a=0; a<rows; a++)
		      {
		         for(b=0; b<=a; b++)
		            System.out.print("* ");
		         System.out.print("\n");
		      }
		      break;
		      
		case 3:

			int x, y;
		      for(x=0; x<rows; x++)
		      {
		    	  for(y=2*(rows-x);y>=0;y--)
		    	  {
		    		  System.out.print(" ");
		    	  }
		    	  for(y=0;y<=x;y++)
		    	  {
		    		  System.out.print("* ");
		    	  }
		    	  System.out.println();
		   }
	
		
	default:
			System.out.println("Wrong choice");
			}
		}
	}
