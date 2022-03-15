package Assignment14Mar;

import java.util.Scanner;

public class All_Patterns {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int input=sc.nextInt();
		System.out.println("Enter choice= 1-Full Star 2-Left Star 3-Right Star");
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			int i, space, j;
		      for(i=0; i<input; i++)
		      {
		         for(space=i; space<input; space++)
		            System.out.print(" ");
		         for(j=0; j<(i+1); j++)
		            System.out.print("* ");
		         System.out.print("\n");
		      }
		      break;
		      
		case 2:

			int  a, b;
		      for(a=0; a<input; a++)
		      {
		         for(b=0; b<=a; b++)
		            System.out.print("* ");
		         System.out.print("\n");
		      }
		      break;
		      
		case 3:

			int x, y;
		      for(x=0; x<input; x++)
		      {
		    	  for(y=2*(input-x);y>=0;y--)
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

