package Com.ExceptionHandling;

public class DivisionByZero {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try {
            int total=10/0;
            System.out.println("execution Won't happen ");
        }
        catch(ArithmeticException  e) {
            System.out.println("Cannot divide a number by zero");

        }

    }

}
