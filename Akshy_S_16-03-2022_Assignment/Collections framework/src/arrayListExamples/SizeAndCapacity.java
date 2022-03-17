package arrayListExamples;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class SizeAndCapacity {
	 static int findCapacity(ArrayList<String> al) throws Exception {
		 
	        Field field = ArrayList.class.getDeclaredField("elementData");
	 
	        field.setAccessible(true);
	 
	        return ((Object[]) field.get(al)).length;
	 
	    }

	public static void main(String[] args) throws Exception {
		ArrayList<String> a = new ArrayList<String>();
		System.out.println(a.size());
		System.out.println(findCapacity(a));
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		a.add("e");
		a.add("f");
		a.add("g");
		a.add("h");
		a.add("i");
		a.add("j");
		System.out.println(a.size());
		System.out.println(findCapacity(a));
		a.add("k");
		System.out.println(a.size());
		System.out.println(findCapacity(a));
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		System.out.println(a.size());
		System.out.println(findCapacity(a));
		a.add("f");
		System.out.println(a.size());
		System.out.println(findCapacity(a));
		a.add("e");
		a.add("f");
		a.add("g");
		a.add("h");
		a.add("i");
		a.add("j");
		System.out.println(a.size());
		System.out.println(findCapacity(a));
		a.add("f");
		System.out.println(a.size());
		System.out.println(findCapacity(a));
	}

}
