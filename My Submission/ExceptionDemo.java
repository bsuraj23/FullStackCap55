package training;

import java.util.Scanner;

public class ExceptionDemo {
		
		public static void main(String args[]) {
			System.out.print("Enter a number");
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			try {
				if(a==1) {
					int b=1/0;
				}
				else {
					int ar[]=new int[1];
					for(int i=0;i<=a;i++) {
						ar[i]=1;
					}
				}
			} catch (ArithmeticException e) {
				// TODO Auto-generated catch block
				System.out.println("An Arithmetic Exception has occured");
			}
			catch(ArrayIndexOutOfBoundsException ara) {
				System.out.println("An ArrayIndexOutOfBounds Exception has occured");
			}
	}
}
