package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//HashMap<Integer ,String> map=new HashMap<Integer,String>();
//LinkedHashMap<Integer ,String> map=new LinkedHashMap<Integer,String>();
TreeMap<Integer ,String> map=new TreeMap<Integer,String>();
map.put(1, "Venkat");
map.put(2, "sarath");
map.put(3, "kishaore");
map.put(4, "Vivek");
map.put(4, "Abhi");
map.put(null, "cenkat");
map.put(11, "Veni");
map.put(12, "Veni");
map.put(null, null);
map.put(22, null);
System.out.println(map);
	}
}
