import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n1 = sc.nextInt();
        int k = 2 * n1 - 2, i, j;
        switch (a) {
            case 1:
                for (i = 0; i < n1; i++)
                {
                    for (j = 0; j < k; j++)
                    {
                        System.out.print(" ");
                    }
                    k = k - 1;

                    for (j = 0; j <= i; j++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (i = 0; i < n1; i++)
                {
                    for (j = 0; j <= i; j++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                for (i = 0; i < n1; i++)
                {
                    for (j = 0; j < k; j++)
                    {
                        System.out.print(" ");
                    }
                    k = k - 2;
                    for (j = 0; j <= i; j++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
        }
    }
}