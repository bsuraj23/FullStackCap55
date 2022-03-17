
import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		String c="a";
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("\t\t\tMENU");
		System.out.println("\t================================\n");
		System.out.println("\t\t1. Left star");
		System.out.println("\t\t2. Full star");
		System.out.println("\t\t3. Right star");
		System.out.println("\t--------------------------------\n");
		System.out.println("\t\nPlease select an option from the above MENU [1,2,3] : ");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:for (int i=1; i<=5; i++) 
        { 
            for (int j=1; j<=i; j++ )
            { 
                System.out.print("*");
            } 
  
            System.out.println();
        }  
  
			break;
		case 2:for (int i=1; i<=5; i++) 
        { 
            for (int k=5; k>i; k-- )
            { 
                System.out.print(" ");
            } 
            for (int j=1; j<=i; j++ )
            { 
                System.out.print("* ");
            } 
  
            System.out.println();
        }  
  
			break;
		case 3:for (int m = 1; m <= 5; m++)
		{
		for (int n = 1; n < m; n++)
		{
		System.out.print(" ");
		}
		for (int p=5; p>=m; p--)
		{
		System.out.print("*");
		}
		System.out.println();
		}
	
			break;
		default:System.out.println("Invalid option...");
			break;
		}
		System.out.println("\t\nDo you want to continue[n/y] : ");
		c=sc.next();
		
		}while(c.equals("y"));
		System.out.println("Program stopped..");
		
	}

}
