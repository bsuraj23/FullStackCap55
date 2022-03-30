package Assigment16Mar;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.addFirst("first");
		list.addLast("last");
		System.out.println(list);
		
		System.out.println(list.removeFirst());
		System.out.println(list.removeLast());
		System.out.println(list+"\n");

		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
