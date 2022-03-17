public class DivisionByZeroExample {
    public static void main(String[] args) {
        try {
            int div = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divid a number by zero");
        }

    }

}