package pattern;

import java.util.Scanner;

public class allPattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("1: Print left pyramind star pattern\n2: Print right pyramid star pattern\n3: Print full pyramid star pattern");
        int ch=sc.nextInt();int n;
        switch (ch){
            case 1:System.out.println("enter an integer value");
                   n=sc.nextInt();
                for(int i=0;i<n;i++){
                    for(int j=0;j<=i;j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:System.out.println("enter an integer value");
                   n=sc.nextInt();
                for(int i=1;i<=n;i++){

                    for(int k=2*(n-i);k>0;k--) {
                        System.out.print(" ");
                    }
                    for(int j=1;j<=i;j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 3:System.out.println("enter an integer value");
                   n=sc.nextInt();
                for(int i=0;i<n;i++){

                    for(int k=n-i;k>1;k--) {
                        System.out.print(" ");
                    }
                    for(int j=0;j<=i;j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            default:System.out.println("wrong choice");
        }

    }
}