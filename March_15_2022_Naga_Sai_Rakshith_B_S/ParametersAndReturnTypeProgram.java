public class ParametersAndReturnTypeProgram {
    public static void main(String[] args) {
        Example example = new Example();
        example.Case1();
        example.Case2(5);
        System.out.println("Without Parameter and With Return type : " + example.Case3());
        System.out.println("With Parameter and With Return type : " + example.Case4(6));
    }
}

class Example {
    public void Case1() {
        System.out.println("Without Parameter and Without Return type");
    }

    public void Case2(int a) {
        System.out.println("With Parameter : " + a + ", and Without Return type");
    }

    public String Case3() {
        return "Hello";
    }

    public String Case4(int a) {
        if (a % 2 == 0)
            return "Even";
        else
            return "Odd";
    }
}