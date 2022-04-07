package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmapprism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "pink");
		map.put(2,"orange");
		map.put(3, "purple");
		map.put(4, "blue");

for(Map.Entry entry:map.entrySet()) {
	System.out.println("Key :"+entry.getKey()+"value :"+entry.getValue());
}
System.out.println("***************************************");
Set<Map.Entry<Integer,String>> set=map.entrySet();
Iterator it=set.iterator();
while(it.hasNext()) {
	Map.Entry ele=(Map.Entry)it.next();
	System.out.println("Key"+ele.getKey()+"value : "+ele.getValue());
}
	}

}
