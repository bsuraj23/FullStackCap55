package Com.ExceptionHandling;

import java.util.ArrayList;

public class PrintArrayListMain {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Idea");
        list.add("Jio");
        list.add("Airtel");
        list.add("Vi");

        System.out.println("Elements of ArrayList are:");
        /*for (int i = 0; i < arl.size(); i++) {
            System.out.println(arl.get(i) + " ");
        }*/
        for(String a:list)
        {
            System.out.println(a);
        }
    }
}
