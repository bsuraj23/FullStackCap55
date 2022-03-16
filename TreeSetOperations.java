package Collections;
import java.util.TreeSet;

public class TreeSetOperations {
  
  public static void main(String[] args) {
  
    TreeSet treeSet = new TreeSet();
    treeSet.add("Govind_1");
    treeSet.add("Govind_2");
    treeSet.add("Govind_3");
   
    System.out.println("TreeSet contents : " + treeSet);
    boolean removed = treeSet.remove("Govind_2");
   
    System.out.println("TreeSet contents after removing " + treeSet);
 
  }
}