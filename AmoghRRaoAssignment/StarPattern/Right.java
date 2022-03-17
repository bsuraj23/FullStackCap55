import java.util.Scanner;

public class Right {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int i, j, row;
        row = s.nextInt();

        for (i = 0; i < row; i++) {
            for (j = 0; j <= i; j++) {

                System.out.print("* ");

            }

            System.out.println();
        }
    }

}
