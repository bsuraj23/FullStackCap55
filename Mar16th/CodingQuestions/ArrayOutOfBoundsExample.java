public class ArrayOutOfBoundsExample {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            int arr[]= {11,22,32,4,15};
            System.out.println(arr[21]);
        }
        //catch(ArrayIndexOutOfBoundsException e) {
        //System.out.println("Array Boundary");

        //}
        catch(Exception g) {
            System.out.println(g);

        }

    }

}
