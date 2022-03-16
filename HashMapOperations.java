package Collections;
import java.util.*;

public class HashMapOperations {
public static void main(String[] args) {
    HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
    hash_map.put(10, "Govind");
    hash_map.put(15, "Govind2");
    hash_map.put(20, "Govind3");
    hash_map.put(25, "Govind4");
    hash_map.put(30, "Govind5");
    System.out.println("Initial Mappings are: " + hash_map);
    String returned_value = (String)hash_map.remove(20);
    System.out.println("Returned value is: "+ returned_value);
    System.out.println("New map is: "+ hash_map);
}
}