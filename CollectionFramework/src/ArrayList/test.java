package ArrayList;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class test {

	static int findCapacity(ArrayList<String>list) throws Exception{
	
		Field field =ArrayList.class.getDeclaredField("elementData");
		field.setAccessible(true);
		return((Object[])field.get(list)).length;
		
		
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();
		System.out.println(list.size());
		System.out.println(findCapacity(list));
		
		list.add("a");
		System.out.println(list.size());
		System.out.println(findCapacity(list));
		list.add("b");
		list.add("c");
		System.out.println(list.size());
		System.out.println(findCapacity(list));
		
	}

}
