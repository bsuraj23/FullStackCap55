package arrayListExamples;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Prashant");
		a.add("Arya");
		a.add("Sunil");
		a.add("Akshy");
		
		String[] s = a.toArray(new String[a.size()]);
		for(String x:s) {
			System.out.println(x);
		}
	}

}
