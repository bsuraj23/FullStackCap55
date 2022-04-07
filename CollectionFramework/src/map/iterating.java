package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class iterating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		  
		   
		   
		    map.put(1,"a");
			map.put(3,"c");
			map.put(2,"b");
			map.put(4,"d");
			map.put(5,"e");
			map.put(6,"b");
	
		Set<Map.Entry<Integer, String>> set=map.entrySet();
		Iterator it =set.iterator();
		while(it.hasNext()) {
			Map.Entry element=(Map.Entry)it.next();
			System.out.println("key:"+element.getKey()+"value:"+element.getValue());
		}
		
	}
	

}
