public class DivideByZero {
    public static void main(String[] args) {
        try {
            int value = 6 / 0;
            System.out.println("Value : " + value);
        } catch (ArithmeticException e) {
            System.out.println(e + " : Cannot divid a number by zero");
        }
    }
}
