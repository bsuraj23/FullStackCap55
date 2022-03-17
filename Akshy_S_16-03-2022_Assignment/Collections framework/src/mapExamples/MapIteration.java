package mapExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteration {

	public static void main(String[] args) {
		HashMap<Integer,String> m = new HashMap<Integer,String>();
		m.put(1,"b");
	    m.put(5,"f");
	    m.put(4,"d");
	    m.put(3,"e");
	    m.put(1,"f");
	    m.put(7, null);
	    m.put(2,"c");
	    m.put(6,null);
	    
	    Iterator<Map.Entry<Integer,String>> t = m.entrySet().iterator();
	    while(t.hasNext()) {
	    	Map.Entry<Integer, String> e = t.next();
	    	System.out.println(e.getKey()+":"+e.getValue());
	    }
	    
	    System.out.println("Using foreach but works only in java 8");
	    
	    m.forEach((k,v)->System.out.println(k+":"+v));
	}

}
