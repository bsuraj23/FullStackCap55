import java.util.Scanner;
public class Patternschoice {
	public static void main(String args[])   
	{    
	int rows,option;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your pattern 1. Right Star 2. Full Star 3. Left Star");
	option=sc.nextInt();
	
	
	switch(option) {
	case 1:
		System.out.println("enter number of rows: \n");
		rows=sc.nextInt();
		System.out.println("your pattern is ");
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		break;
	
	case 2:
		System.out.println("enter no of rows:");
		rows=sc.nextInt();
	    
	    
	    System.out.println("your pattern is ");

	    for (int i = 0; i < rows; i++) 
	    {
	    	
	      for (int j=rows-i; j>1;j--) {
	        System.out.print("  ");
	      }

	      for(int j=0;j<=i;j++) {

	      System.out.print("  * ");
	    }
	    System.out.println();
	    sc.close();
	  }
	break;
	case 3:
		System.out.println("enter number of rows: \n");
		rows=sc.nextInt();
			
		System.out.println("your pattern is ");
		int i, j;      
		for (i=0; i<rows; i++)   
		{  
		for (j=2*(rows-i); j>=0; j--)         
		{  
		System.out.print(" ");   
		}   
		
		for (j=0; j<=i; j++ )   
		{   

		System.out.print("*" + " ");   
		}   
		
		System.out.println();   
		}   
		break;   
	default:
		System.out.println("invalid option");
	}
	}

}
