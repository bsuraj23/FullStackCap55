import java.util.Scanner;

public class Rightstar {
	public static void main(String args[]) {
		int rows;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows:");
		rows=sc.nextInt();
		
		System.out.println("your pattern is ");
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}



