package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListswap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> w=new ArrayList<String>();
w.add("sd");
w.add("nan");
w.add("kerala");
w.add("jkl");
w.add("mno");
System.out.println(w);
Collections.swap(w, 0, 2);
System.out.println(w);

	}

}
