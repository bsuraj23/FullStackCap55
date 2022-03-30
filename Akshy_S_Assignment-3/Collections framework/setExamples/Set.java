package setExamples;

//import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		//HashSet<String> l = new HashSet<String>(); 
		//unordered  //no duplicates //null values are inserted at the beginning
		
		//LinkedHashSet<String> l = new LinkedHashSet<String>();
		//follows insertion order  //no duplicates
		
		TreeSet<String> l = new TreeSet<String>();
		//inserts in sorted order //no duplicates //cannot insert null
		l.add("a");
		l.add("z");
		l.add("n");
		l.add("k");
		l.add("d");
		l.add("f");
		l.add("a");
		//l.add(null);
		//l.add(null);
		System.out.println(l);
	}

}
