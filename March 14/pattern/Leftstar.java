import java.util.Scanner;

public class Leftstar {
	public static void main(String args[])   
	{    
	int rows;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number of rows:");
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
	}   
	}  


