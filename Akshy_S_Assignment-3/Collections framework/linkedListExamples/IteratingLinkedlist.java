package linkedListExamples;

import java.util.Iterator;
import java.util.LinkedList;



public class IteratingLinkedlist {

	public static void main(String[] args) {
LinkedList<String> l = new LinkedList<String>();
		
		l.add("ab");
		l.add("bc");
		l.add("cd");
		l.add("de");
		l.add("ef");
		
		Iterator<String> t = l.iterator();
		
		while(t.hasNext()) {
			System.out.print(t.next()+" ");
		}
		System.out.println();
		Iterator<String> t1 = l.descendingIterator();
		
		while(t1.hasNext()) {
			System.out.print(t1.next()+" ");
		}
	}

}
