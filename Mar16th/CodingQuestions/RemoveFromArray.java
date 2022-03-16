

import java.util.ArrayList;

public class RemoveFromArray{
  public static void main(String[] args) { 
    ArrayList<String> m = new ArrayList<String>();
    m.add("Jan");
    m.add("Feb");
    m.add("Mar");
    m.add("April");
    System.out.println("Before Deletion: ");
    System.out.println(m);
    m.remove(2);
    System.out.println("After Deletion :");
    System.out.println(m);
  } 
}
