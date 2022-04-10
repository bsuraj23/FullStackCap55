package collection;

import java.util.ArrayList;
import java.util.ListIterator;
public class ListIteratorDemo {


	public static void main(String[] args) {
	  ArrayList a1 = new ArrayList<>();
	    a1.add("A");
	    a1.add("B");
	    a1.add("C");
	    a1.add("D");
	    a1.add("E");
	    a1.add("F");
	    System.out.println(a1); // [A, B, C, D, E, F]

	    ListIterator listItr = a1.listIterator();
	    // we move to forward direction
	    while (listItr.hasNext()) {
	        String s = listItr.next().toString();
	        if (s.equals("F")) {
	            listItr.remove();
	        }
	    }
	    System.out.println(a1); // A, B, C, D, E]

	    while(listItr.hasPrevious())
	    {
	        String s =listItr.previous().toString();
	        if(s.equals("E"))
	        {
	            listItr.add("F");
	        }
	        if(s.equals("F"))
	        {
	            listItr.set("E0");
	        }
	    }
	    System.out.println(a1); //[A, B, C, D, E0, E]
	}
	}