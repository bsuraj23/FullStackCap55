package Com.ExceptionHandling;

public class ArrayIndexOutOfBounds {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            int arr[] = {1, 2, 3, 4, 5};
            System.out.println(arr[15]);
        }
        /*catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("Array Boundary")
    }*/
        catch(Exception g) {
            System.out.println(g);

        }

    }

}