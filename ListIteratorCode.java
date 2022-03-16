package Collections;
import java.util.*;

public class ListIteratorCode  {
    public static void main(String[] args)
    {
        List<String> names = new LinkedList<>();
        names.add("Govind1");
        names.add("Govind2");
        names.add("Govind3");
  
        ListIterator<String> namesIterator
            = names.listIterator();
  
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }
  
        for (String s : names) {
            System.out.println(s);
        }
    }
}