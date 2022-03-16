package java_day8_COLLECTION;

import java.util.ArrayList;
import java.util.*;


public class intList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Iterator<Integer> it= list.iterator();
		while(it.hasNext())
		{
			Integer i =it.next();
			System.out.println(it.next());
			
		}
		


	}

}
