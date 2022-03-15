package pattern;

import java.util.Scanner;

public class rightStar {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an integer value");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){

            for(int j=2*(n-i);j>0;j--) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

