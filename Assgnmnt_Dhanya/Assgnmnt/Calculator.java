
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		String c="a";
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("\t\t\tCALCULATOR");
		System.out.println("\t================================\n");
		System.out.println("\t\t1. ADD");
		System.out.println("\t\t2. SUBSTRACT");
		System.out.println("\t\t3. MULTIPLY");
		System.out.println("\t\t4. DIVIDE");
		System.out.println("\t--------------------------------\n");
		System.out.println("\t\nPlease select an option from the above MENU [1,2,3,4] : ");
		ch=sc.nextInt();
		System.out.println("\t\nPlease input two integers : ");
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		
		switch(ch)
		{
		case 1: System.out.print("SUM = "+(a+b));
            
			break;
		case 2:      System.out.print("DIFFERENCE = "+(a-b));
           
			break;
		case 3:System.out.print("PRODUCT = "+(a*b));
		
			break;
		case 4:System.out.print("QUATIENT = "+(a/b));
		
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



