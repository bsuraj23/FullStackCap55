package List_methods;

import java.util.*;

public class List_Enumeration {

	public static void main(String[] args) {  
        //Create array list object         
          List<String> arr = new ArrayList<String>();                
          	arr.add("Akshy");  
  			arr.add("Ajay");  
  			arr.add("Prashant");  
             
            Enumeration<String> en = Collections.enumeration(arr);  
            System.out.println("The Enumeration List are: ");  
            while(en.hasMoreElements()){  
                 System.out.println(en.nextElement());  
            
            }
	}

}
