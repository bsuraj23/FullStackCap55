package arrayListExamples;

import java.util.ArrayList;

public class ArrayCollectionsAdd1 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Ak");
		list1.add("aks");
		list1.add("aksh");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Ak1");
		list2.add("aks1");
		list2.add("aksh1");
		
		list1.addAll(list2);
		System.out.println(list1);
		System.out.println(list2);
	}

}
