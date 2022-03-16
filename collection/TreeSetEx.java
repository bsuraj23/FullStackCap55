package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

		public static void main(String[] args) {
			

			TreeSet<String> set=new TreeSet<String>();	//sort the elements ,will not allow null values	
			set.add("a");
			set.add("b");
			set.add("c");
			set.add("d");
			set.add("n");
			set.add("e");
			
			
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
