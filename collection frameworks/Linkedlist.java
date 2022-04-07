package collections;

import java.util.LinkedList;

public class Linkedlist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList lis=new LinkedList();
lis.add(90);
lis.add(10);
lis.add(20);
lis.add(30);
lis.add(40);
lis.add(90);
System.out.println(lis);
lis.addFirst(55);
System.out.println(lis);
System.out.println(lis.removeFirst());
System.out.println(lis);
//System.out.println(lis.removeLast());
//lis.removeAll(lis);
//System.out.println(lis);
System.out.println(lis.pollFirst());
System.out.println(lis);
System.out.println(lis.peek());
System.out.println(lis);
System.out.println(lis.peekLast());
System.out.println(lis);
LinkedList list1=new LinkedList();
list1.addAll(lis);
System.out.println(list1);








	}

}
