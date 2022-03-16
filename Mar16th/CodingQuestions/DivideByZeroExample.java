public class DivideByZeroExample {
    public static void main(String[] args) {
        try {
            int total = 17 / 0;
        }
        catch(ArithmeticException  e) {
            System.out.println("Can't divide a number by zero");

        }

    }

}
