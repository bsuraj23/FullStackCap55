package mapExamples;

//import java.util.HashMap;
//import java.util.LinkedHashMap;
import java.util.TreeMap;


public class map {

	public static void main(String[] args) {
		//HashMap<Integer,String> set=new HashMap<Integer,String>();
        //LinkedHashMap<Integer,String> set=new LinkedHashMap<Integer,String>();
        TreeMap<Integer,String> set=new TreeMap<Integer,String>();
	     //set.put(null,"a");
	     set.put(1,"b");
	     set.put(5,"f");
	     set.put(4,"d");
	     set.put(3,"e");
	     //set.put(null, "a1");
	     set.put(1,"f");
	     set.put(7, null);
	     set.put(2,"c");
	     set.put(6,null);
	     System.out.println(set);
	}

}
