package arrayListExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayCollectionsLoop {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		System.out.println("*******************");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("*******************");
		
		for(int x: list) {
			System.out.println(x);
		}
		System.out.println("*******************");
		
		list.forEach(y->System.out.println(y));
		System.out.println("*******************");
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
