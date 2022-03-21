import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_delete {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Mango");
        fruits.remove(2);
        System.out.println(fruits);
    }

}