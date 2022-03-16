package Col_LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> set=new LinkedHashSet<String>();  
		set.add("Prashant");
		set.add(null);
		set.add("Vijay");  
		set.add("Akshy");  
		set.add("Ajay");  
		set.add("Prashant"); 
		
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		System.out.println("Follow the Insertion Order Null is Allowed");  
	}

}
