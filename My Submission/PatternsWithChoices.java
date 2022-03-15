package JavaHandsOn;

import java.util.Scanner;

public class PatternsWithChoices {
    static void fullStar(int n) {
    	for(int i=n;i>=1;i--) {
			for(int j=1;j<=n;j++) {
				if(j>=i) {
					System.out.print(" *");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
    }
    static void leftStar(int n) {
    	for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
		
    }
    static void rightStar(int n) {
    	for(int i=n;i>=1;i--) {
			for(int j=1;j<=n;j++) {
				if(j>=i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1:Full Star, 2:Left Star, 3:Right Star");
		Scanner in=new Scanner(System.in);
		int ch=in.nextInt();
		System.out.println("enter number of rows");
		int n=in.nextInt();
		switch(ch) {
		case 1:fullStar(n);
			break;
		case 2:leftStar(n);
			break;
		case 3:rightStar(n);
			break;
		default:
			System.out.println("Wrong input ");
		}
	}

}
