package Assigment16Mar;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrList {

		public static void main(String[] args) {
			ArrayList<String> list1=new ArrayList<String>();
			list1.add("a");
			list1.add("b");
			list1.add("c");
			list1.add("d");
			list1.add("e");
			System.out.println(list1);
			list1.remove(2);
			list1.remove(3);
			System.out.println("After removal");
			Iterator it=list1.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			
		}
}
