package Collections;
import java.util.LinkedList;
public class LinkedListOpeations {
  
    public static void main(String args[])
    {
        LinkedList<String> list = new LinkedList<String>();
  
        list.add("Govind");
        list.add("Govind2");
        list.add("Govind3");
        list.add("Govind4");
        list.add("Govind5");
        System.out.println("LinkedList:" + list);
        list.remove();
        System.out.println("Final LinkedList:" + list);
    }
}