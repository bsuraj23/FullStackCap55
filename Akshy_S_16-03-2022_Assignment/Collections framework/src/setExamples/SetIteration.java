package setExamples;

import java.util.HashSet;
import java.util.Iterator;

public class SetIteration {

	public static void main(String[] args) {
		HashSet<String> l = new HashSet<String>();
		l.add("a");
		l.add("b");
		l.add("n");
		l.add("k");
		l.add("d");
		l.add("f");
		l.add("a");
		l.add(null);
		l.add(null);
		
		Iterator<String> t = l.iterator();
		while(t.hasNext()) {
			System.out.println(t.next());
		}
	}

}
