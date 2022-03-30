package parameter;
 //with parameter but no return type
public class Parameter1 {
    public static void main(String args[])
    {
        int a = 5;
        int b = 1;
 
        // Calling the function with 2 parameters
        calc(a, b);
    }
    public static void calc(int x, int y)
    {
        int sum = x + y;
        // Displaying the sum
        System.out.print("Sum of two numbers is :" + sum);
    }
}
