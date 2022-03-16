import java.util.ArrayList;

public class AddToArray {
    public static void main(String[] args) {
        ArrayList<String> b = new ArrayList<String>();
        System.out.println("Before Addition: ");
        System.out.println(b);
        b.add("Royal Enfield");
        b.add("Ducati");
        b.add("BMW");
        b.add("Duke");
        System.out.println("After Addition: ");
        System.out.println(b);
    }
}
