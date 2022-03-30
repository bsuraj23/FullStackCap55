import java.util.Scanner;

public class Fullstar {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int rows;
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
	}
	
}



