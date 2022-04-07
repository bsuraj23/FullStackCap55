package LinkedTest;

import java.util.LinkedList;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list=new LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
		System.out.println(list);
		System.out.println("---------");
		
		list.addFirst("start");
		System.out.println(list);
		System.out.println("---------");
		
		list.addLast("last");
		System.out.println(list);
		System.out.println("---------");
		
		System.out.println(list.removeFirst());
		System.out.println(list);
		System.out.println("---------");
		
		System.out.println(list.removeLast());
		System.out.println(list);
		System.out.println("---------");
		
		System.out.println(list.pollFirst());
		System.out.println(list);
		System.out.println("poll---------");
		
		System.out.println(list.peek());
		System.out.println(list);
		System.out.println("---------");
	
		list.removeAll(list);
		System.out.println(list);
		System.out.println("---------");
		
		System.out.println(list.pollFirst());
		System.out.println(list);
		System.out.println("---------");
		
		System.out.println(list.peek());
		System.out.println(list);
		System.out.println("---------");
		
	
	}
	

}
