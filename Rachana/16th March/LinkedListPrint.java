package com.collections;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListPrint {

	public static void main(String[] args) {
		
		LinkedList al= new LinkedList<String>();
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		} 
		
	}

}
