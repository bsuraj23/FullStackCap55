package arrayListExamples;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayCollectionsSort {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Prashant");
		a.add("Arya");
		a.add("Abc");
		a.add("Abd");
		a.add("Z");
		a.add("z");
		a.add("Sunil");
		a.add("a");
		a.add("Akshy");
	
		System.out.print("ArrayList before sorting: ");
		System.out.println(a);
		
		System.out.print("ArrayList after sorting in ascending order: ");
		Collections.sort(a);
		System.out.println(a);
		
		System.out.print("ArrayList after sorting in decending order: ");
		Collections.sort(a,Collections.reverseOrder());
		System.out.println(a);
		
		System.out.print("ArrayList after reversing: ");
		Collections.reverse(a);
		System.out.println(a);
	}

}
