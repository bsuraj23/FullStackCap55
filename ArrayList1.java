package com.capg.Arraylist;

import java.util.*;

public class ArrayList1 {
	public static void main(String[] args) {
	ArrayList<String> a=new ArrayList<String>();
	ArrayList<Integer> a1=new ArrayList<Integer>();
	ArrayList<String> a2=new ArrayList<String>();
	
	a.add("Enock");
	a.add("Harris");
	a.add("Suhas");
	
	a1.add(17);
	a1.add(24);
	a1.add(7);
	a1.add(2000);
	//a1.addAll(a1);
	
	a2.add("July");
	a2.add("January");
	a2.add("August");
	a2.add("December");
	a2.addAll(a);
	
	System.out.println("List ELements : "+a);
	System.out.println("List ELements : "+a1);
	
	
	System.out.println("Accesing the elements using ForEach Loop : ");
	
	for(String list: a) {
		System.out.println(list);
		
	}
	
	System.out.println("Accesing the elements using While Loop : ");
	int i=0;
	while(i<a1.size()) {
		System.out.println(a1.get(i));
		i++;
	}
	
	
	System.out.println("Accesing the elements using Iterator Method : ");
	
	Iterator<String> itr=a2.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	System.out.println("Accesing the elements using Enumeration Method : ");
	
	Enumeration<String> enum1=Collections.enumeration(a2);
	while(enum1.hasMoreElements()) {
		System.out.println(enum1.nextElement());
	}
	
	System.out.println("\n Operations on ArrayList\n");
	
	System.out.println("List ELements : "+a2);
	
	Collections.reverse(a2);//Reversing Method
	System.out.println("Reversed list"+a2);
	
	//System.out.println("Before Sorting the List : "+a2);
	Collections.sort(a2); //Sorting Method
	System.out.println("After Sorting the List : "+a2);
	
	Collections.sort(a2,Collections.reverseOrder()); //Sorting Reversed Order Method
	System.out.println("Reversing the sorted list : "+a2);
	
	Collections.swap(a2, 0, 4);  //Swapping Method
	System.out.println("After Swapping Reversed sorted list : "+a2);
}
}

//Enock Harris Suhas F
