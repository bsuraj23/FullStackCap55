package Col_TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set=new TreeSet<String>();    
		set.add("Prashant");
		//set.add(null);
		set.add("Vijay");  
		set.add("Akshy");  
		set.add("Ajay");  
		set.add("Prashant"); 
		
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		System.out.println("values stored in storted Order,Null is Not Allowed");  
	}

}
