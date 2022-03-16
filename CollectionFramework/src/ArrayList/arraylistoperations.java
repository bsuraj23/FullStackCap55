package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class arraylistoperations {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
			ArrayList<String> list= new ArrayList<String>();
					list.add("a");
					list.add("abc");
					list.add("efg");
					System.out.println("FINAL BEFORE LIST:"+list);
					
					Collections.sort(list);
					System.out.println("FINAL AFTER LIST:"+list);
					
					Collections.sort(list,Collections.reverseOrder());
					System.out.println("FINAL AFTER reverse LIST:"+list);
					
	}

}
