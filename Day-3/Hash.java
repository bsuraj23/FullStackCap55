package Collections;

import java.util.*;
public class Hash {
	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		//LinkedHashMap<Integer, String> map=new LinkedHashMap<Integer, String>();
		//TreeMap<Integer, String> map=new TreeMap<Integer, String>();
		map.put(1, "venkat");
		map.put(3, "swapna");
		map.put(null, "test");
		map.put(2, "Ramya");
		map.put(2, "lakshmi");
		map.put(null, "check1");
		map.put(22, null);
		map.put(21, null);
		System.out.println(map);
	}
}
