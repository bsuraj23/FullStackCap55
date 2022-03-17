package arrayListExamples;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Prashant");
		a.add("Arya");
		a.add("Sunil");
		a.add("Akshy");
		ListIterator<String> t = a.listIterator();
		while(t.hasNext()) {
			if(t.next()=="Arya") {
				t.add("Aditya");
			}
		}
		System.out.println(a);
	}

}
