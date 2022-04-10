package collection;

import java.util.Enumeration;
import java.util.Vector;
public class EnumerationDemo {

	public static void main(String[] args) {

	    Vector vector =new Vector ();

	    for(int i=0;i<=10;i++)
	    {
	        vector.addElement(i);

	    }
	    System.out.println(vector); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

	    Enumeration e = vector.elements();

	    while(e.hasMoreElements())
	    {
	        System.out.print(e.nextElement()+" ");
	 // 0 1 2 3 4 5 6 7 8 9 10
	    }
	}
	}