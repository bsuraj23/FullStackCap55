package ArrayList;

import java.util.ArrayList;

public class Arraylist_to_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();
		list.add("b");
		list.add("c");
		list.add("bb");
		list.add("cc");
		System.out.println(list);
		
		String arr[]=list.toArray(new String[list.size()]);
	    for(String element :arr) {
	    	System.out.println(element);
	    	
	    }
	}

}
