package m16;

import java.util.ArrayList;
import java.util.ListIterator;

public class listiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrlist = new ArrayList<String>();  
		arrlist.add("d");  
		arrlist.add("dd");  
		arrlist.add("ddd");  
		arrlist.add("dddd");  
		arrlist.add("ddddd");  
		System.out.println(arrlist);    // [d, dd, ddd, dddd, ddddd]  
		  
		ListIterator<String> iterator = arrlist.listIterator(2);  
		while (iterator.hasNext())  
		{  
		String i = iterator.next();  
		System.out.println(i);  

	}

	}
}
