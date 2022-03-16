import java.util.ArrayList;

public class PrintArrayList {

    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();

        l.add("Sun");
        l.add("Mon");
        l.add("Tue");
        l.add("Wed");

        System.out.println("Arraylist :");
        for (int j=0; j < l.size(); j++) {
            System.out.println(l.get(j) + " ");
        }
    }
}