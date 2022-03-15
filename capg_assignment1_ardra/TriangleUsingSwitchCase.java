import java.util.Scanner;
public class TriangleUsingSwitchCase {
        public static void main(String[] args) {
                System.out.println("Type 1 to print left triangle,\nType 2 to print right triangle, \nType 3 to print full triangle");
                Scanner sc = new Scanner(System.in);
                int choice=sc.nextInt();
                int i, j , n=5;
                switch(choice){
                        case 1:
                                for (i=0; i<n; i++)  {
                                        for (j=2*(n-i); j>=0; j--)  {
                                                System.out.print(" ");
                                        }
                                        for (j=0; j<=i; j++ ) {
                                                System.out.print("* ");
                                        }
                                        System.out.println();
                                }
                                break;
                        case 2:
                                for ( i=0 ; i<n ; i++) {
                                        for ( j=0; j<i; j++) {
                                                System.out.print("* ");
                                        }
                                        System.out.println();
                                }
                                break;
                        case 3:
                                for (i=0; i<n; i++)   {
                                        for (j=n-i; j>1; j--)   {
                                                System.out.print(" ");
                                        }
                                        for (j=0; j<=i; j++ )   {
                                                System.out.print("* ");
                                        }
                                        System.out.println();
                                }
                                break;
                }
        }}
