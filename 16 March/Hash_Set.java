package Assigment16Mar;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Hash_Set{

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>(); //sorts elements(Allows null but no duplicate)
		//LinkedHashSet<String> set=new LinkedHashSet<String>();//follows insertion order(No duplicate but allows null)
		//TreeSet<String> set=new TreeSet<String>(); //sort elements,will not follow insertion order(No null and duplicate values)
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("e");
		set.add("n");
		set.add("f");
		set.add("f");
		set.add(null);
		set.add(null);
		System.out.println(set);
		set.remove("f");
		set.remove("c");
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		}
}