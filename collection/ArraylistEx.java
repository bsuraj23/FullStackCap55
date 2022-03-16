package collection;


import java.util.ArrayList;
import java.util.Iterator;


public class ArraylistEx {

	public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		System.out.println("Before removing:");
		System.out.println(list);
		
		list.remove(3);// removed the element from index 3
		System.out.println("After removing");
		System.out.println(list);
		Iterator it=list.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}

	}

}
