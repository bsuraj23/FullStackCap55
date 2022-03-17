package linkedListExamples;

import java.util.LinkedList;

public class addExamples {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		
		l.add("ab");
		l.add("bc");
		l.add("cd");
		l.add("de");
		l.add("ef");
		System.out.println(l);
		
		l.add(2, "cc");
		l.add(6, "fg");
		System.out.println(l);
		
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("ab1");
		l1.add("bc1");
		l1.add("cd1");
		l1.add("de1");
		l1.add("ef1");
		System.out.println(l1);
		
		l.addAll(l1);
		System.out.println(l);
		
		l.addAll(4,l1);
		System.out.println(l);
		
		l.addFirst("first");
		l.addLast("last");
		System.out.println(l);
		
	}

}
