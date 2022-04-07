package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("Prashant");
		a.add("Arya");
		a.add("Sunil");
		a.add("Akshy");
		ListIterator<String> t = a.listIterator();
		while(t.hasNext()) {
		if(t.next()=="Akshy") {
		t.add("Aditya");
		}
		}
		System.out.println(a);
	}

}
