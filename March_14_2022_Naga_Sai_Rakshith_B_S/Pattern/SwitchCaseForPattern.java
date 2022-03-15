package March_14_2022.Pattern;

import March_14_2022.Pattern.FullPattern;
import March_14_2022.Pattern.LeftPattern;
import March_14_2022.Pattern.RightPattern;

import java.util.Scanner;

public class SwitchCaseForPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1: Left Pattern\n2: Right Pattern\n3: Full Pattern\nChoose the Pattern : ");
        int value = sc.nextInt();
        switch (value) {
            case 1: {
                System.out.println("Enter No.of Lines : ");
                int num = sc.nextInt();
                LeftPattern.printPattern(num);
                break;
            }
            case 2: {
                System.out.println("Enter No.of Lines : ");
                int num = sc.nextInt();
                RightPattern.printPattern(num);
                break;
            }
            case 3: {
                System.out.println("Enter No.of Lines : ");
                int num = sc.nextInt();
                FullPattern.printPattern(num);
                break;
            }
        }
    }
}
