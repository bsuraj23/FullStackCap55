package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HashSet<String> set=new HashSet<String>();
  //LinkedHashSet<String> set=new LinkedHashSet<String>();
  //TreeSet<String> set=new TreeSet<String>();
   
   
    set.add("a");
	set.add("c");
	set.add("b");
	set.add("d");
	set.add("e");
	set.add("b");
	//set.add(null);
	//set.add(null);
	System.out.println(set);
	}

}
