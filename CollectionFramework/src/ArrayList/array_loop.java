package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class array_loop {
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
				list.add("a");
				list.add("abc");
				list.add("efg");
				
				System.out.println(list);
				System.out.println("____________");
				
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
			System.out.println("____________");
			
			for(String item:list) {
				System.out.println(item);
			
			}
			System.out.println("____________");
			
		int i=0;
		while(i<list.size()) {
			System.out.println(list.get(i));
			i++;
		}
		System.out.println("____________");
		
		Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println("____________");
		 
		Enumeration en=Collections.enumeration(list);
	    while(en.hasMoreElements()) {
	    	System.out.println(en.nextElement());
			
	    }
	    list.forEach(st->System.out.println(st));
	}
		
	
	

}
