package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>(); 

		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("n");
		set.add("e");
		set.add(null);
		
		System.out.println("Before removing:");	
		System.out.println(set);
		set.remove("a");
		System.out.println("After removing");
		System.out.println(set);
		Iterator it=set.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}

	}

}
