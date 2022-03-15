package March_14_2022.Pattern;

import java.util.Scanner;

public class LeftPattern {
    public static void printPattern(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
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
