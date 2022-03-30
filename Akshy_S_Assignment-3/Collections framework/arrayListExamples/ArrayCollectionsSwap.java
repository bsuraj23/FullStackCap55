package arrayListExamples;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayCollectionsSwap {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Prashant");
		a.add("Arya");
		a.add("Sunil");
		a.add("Akshy");
		
		System.out.println(a);
		
		Collections.swap(a, 1, 3);
		System.out.println(a);

	}

}
