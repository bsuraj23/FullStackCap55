package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistEx {

	public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<String>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		System.out.println("Before removing:");
		System.out.println(list);
		
		list.remove();
		System.out.println("After removing");
		System.out.println(list);
		Iterator it=list.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}

	}

}
