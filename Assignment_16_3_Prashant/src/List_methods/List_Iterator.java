package List_methods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arr = new ArrayList<String>();                
      	arr.add("Akshy");  
		arr.add("Ajay");  
		arr.add("Prashant");  
          
			Iterator<String> itr=arr.iterator();  
			while(itr.hasNext()){  
				System.out.println(itr.next());  
			}
	}

}
