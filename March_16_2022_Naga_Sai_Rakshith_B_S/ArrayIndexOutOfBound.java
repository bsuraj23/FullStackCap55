public class ArrayIndexOutOfBound {
    public static void main(String[] args) {
        int array[] = { 0, 1, 2, 3 };
        try {
            System.out.println(array[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
