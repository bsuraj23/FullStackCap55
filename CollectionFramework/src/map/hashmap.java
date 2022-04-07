package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap<Integer,String> map=new HashMap<Integer,String>();
		  //LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
		  TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		   
		   
		    map.put(1,"a");
			map.put(3,"c");
			map.put(2,"b");
			map.put(4,"d");
			map.put(5,"e");
			map.put(6,"b");
			//map.put(7,null);
			//map.put(8, null);
			//map.put(null,"abc");
			//map.put(null,"cfg");
			System.out.println(map);
	}

}
