import java.util.Scanner;

public class SwitchPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter your choice :");
        System.out.println("1 . Left half Pattern");
        System.out.println("2 . Right half Pattern");
        System.out.println("3 . Full Pattern");

        n = sc.nextInt();
        switch (n) {
            case 1:
                for (int i = 0; i <= 5; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 0; i < 5; i++) {
                    for (int k = 0; k < 4 - i; k++) {
                        System.out.print("  ");
                    }
                    for (int j = 0; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 0; i < 5; i++) {
                    for (int k = 0; k < 4 - i; k++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Wrong Choice");
        }

        sc.close();
    }

}
