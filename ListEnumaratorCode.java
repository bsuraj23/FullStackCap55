package Collections;
import java.util.*;

public class ListEnumaratorCode {
    public static void main(String[] argv) throws Exception
    {
            List<String> arrlist = new ArrayList<String>();
            arrlist.add("Govind1");
            arrlist.add("Govind2");
            arrlist.add("Govind3");
            System.out.println("List: " + arrlist);
            Enumeration<String> e = Collections.enumeration(arrlist);

            System.out.println("\nEnumeration over list: ");

            while (e.hasMoreElements())
                System.out.println("Value: " + e.nextElement());
    }
}