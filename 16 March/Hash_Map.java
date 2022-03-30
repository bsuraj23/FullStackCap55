package Assigment16Mar;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hash_Map {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(10, "ABC");
		map.put(20, "DEF");
		map.put(30, "XYZ");
		map.put(30, "LMN"); //since key is same,replaces the previous statement
		map.put(40, "PQR");
		map.put(50, "BLM");
		map.remove(50, "BLM");
		
		Set<Map.Entry<Integer,String>> set=map.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			Map.Entry element=(Map.Entry) it.next();
			System.out.println("Key: "+element.getKey()+" Value: "+element.getValue());
		}

	}

}
