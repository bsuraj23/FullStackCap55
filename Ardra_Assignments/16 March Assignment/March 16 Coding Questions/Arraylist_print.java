import java.util.ArrayList;
public class Arraylist_print {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("One");
        ar.add("Two");
        ar.add("Three");
        for (int i=0; i < ar.size(); i++) {
            System.out.println(ar.get(i) + " ");
        }
    }
}