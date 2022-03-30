package Col_HashSet;

import java.util.*;  

public class Sample{  
	public static void main(String args[]){  
		//Creating HashSet and adding elements  
		HashSet<String> set=new HashSet<String>();  
		set.add("Prashant");  
		set.add("Vijay");  
		set.add("Akshy");  
		set.add("Ajay");  
		set.add(null);
		set.add("Prashant"); 
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		System.out.println("Does not follow the Insertion Order, Null is Allowed");  
	
	}  
}  
