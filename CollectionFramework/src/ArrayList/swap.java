package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println(list);
		
		Collections.swap(list, 2, 4);
		System.out.println(list);
	}

}
