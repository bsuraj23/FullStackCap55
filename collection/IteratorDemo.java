package collection;

import java.util.ArrayList;
import java.util.Iterator;
public class IteratorDemo {

	public static void main(String[] args) {

	    ArrayList a1 = new ArrayList<>();

	    for(int i=0;i<=5;i++)
	    {
	        a1.add(i);
	    }
	    System.out.println(a1); // [0, 1, 2, 3, 4, 5]

	    Iterator itr=a1.iterator();
	    while(itr.hasNext())
	    {
	        Integer i=(Integer) itr.next();
	        if(i % 2==0)
	        {
	            System.out.print(i+" ");
	        }
	        else
	        {
	            itr.remove();
	        }
	    }
	    System.out.println("\n"+a1);
	}
	}