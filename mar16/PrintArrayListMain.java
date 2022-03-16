package mar16;

import java.util.ArrayList;

public class PrintArrayListMain {

    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<>();

        obj.add("Rahul");
        obj.add("Sai");
        obj.add("Ram");
        obj.add("Vema");

        System.out.println("Elements of ArrayList are:");
        for (int i = 0; i < obj.size(); i++) {
            System.out.println(obj.get(i) + " ");
        }
    }
}