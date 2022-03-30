package collections;

import java.util.ArrayList;

public class ArrayList_to_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> a1=new ArrayList<String>();
a1.add("kj");
a1.add("jan");
a1.add("porn");
a1.add("kali");
System.out.println(a1);
String arr[]=a1.toArray(new String[a1.size()]);
for(String ele:arr) {
	System.out.println(ele);
}

	}

}
