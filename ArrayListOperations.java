package Collections;

import java.util.ArrayList;
public class ArrayListOperations {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Govind");
        list.add("Govind2");
        list.add("Govind3");
        System.out.println(list);
        list.remove(1);
        System.out.println("After removing:");
        System.out.println(list);
        
    }
    
}