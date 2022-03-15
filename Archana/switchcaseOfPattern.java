import java.util.Scanner;
import java.util.regex.Pattern;


public class switchcaseOfPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int ch=input.nextInt();
		switch(ch) {
			case 1:{
				System.out.println("enter rows:");
				int n=input.nextInt();
				for (int a = 0; a < n; a++) {
		            for (int b = 0; b <= a; b++) {
		                System.out.print("* ");}
		           System.out.println();
		           }
			break;
			}
			case 2:{
				System.out.println("enter rows:");
				int n=input.nextInt();
				for (int i=0; i<n; i++)
		        {
		 
		            // inner loop to handle number spaces
		            // values changing acc. to requirement
		            for (int j=n-i; j>1; j--)
		            {
		                // printing spaces
		                System.out.print(" ");
		            }
		  
		            //  inner loop to handle number of columns
		            //  values changing acc. to outer loop
		            for (int j=0; j<=i; j++ )
		            {
		                // printing stars
		                System.out.print("* ");
		            }
		  
		            // ending line after each row
		            System.out.println();
		        }
		  
		        break;    
			}
		            
		case 3:{
			  
			System.out.print("Enter rows you want to print: ");   
			int n = input.nextInt();  
			int i, j;
			 
	        for(i=0; i<n; i++)
	        {
	            for(j=2*(n-i); j>=0; j--)
	            {
	                System.out.print(" ");
	            }
	            
	            for(j=0; j<=i; j++)
	            {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }
		}}}
