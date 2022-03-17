package March_14_2022.Pattern;

import java.util.Scanner;

public class FullPattern {
    public static void printPattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.print("|");
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.of Lines : ");
        int num = sc.nextInt();
        printPattern(num);
    }
}