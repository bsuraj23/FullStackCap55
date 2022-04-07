public class fullstar{
public static void main(String args[]){
for(int i=0;i<5;i++)
    {
        for(int k=i;k<5;k++)
        System.out.print(" ");

        // printing '*' in each column.
        for(int j=0;j<=i;j++)
        {
          // We print '*' for each row.
          System.out.print("* ");
        }

        System.out.println();
    }
}
}

}