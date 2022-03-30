package linkedListExamples;

import java.util.LinkedList;

public class removeExamples {

	public static void main(String[] args) {
LinkedList<String> l = new LinkedList<String>();
		
		l.add("ab");
		l.add("bc");
		l.add("cd");
		l.add("de");
		l.add("ef");
		System.out.println(l);
		
		l.remove("bc");
		System.out.println(l);
		
		l.remove(1);
		System.out.println(l);
		
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("ab1");
		l1.add("bc1");
		l1.add("cd1");
		
		l.addAll(l1);
		System.out.println(l);
		
		l.removeAll(l1);
		System.out.println(l);
		
		l.removeFirst();
		System.out.println(l);
		
		l.removeLast();
		System.out.println(l);
		
		l.add("ab");
		l.add("bc");
		l.add("ab");
		l.add("bc");
		l.add("ce");
		System.out.println(l);
		
		l.removeFirstOccurrence("bc");
		System.out.println(l);
		
		l.removeLastOccurrence("ab");
		System.out.println(l);
		
		l.clear();
		System.out.println(l);
	}

}
