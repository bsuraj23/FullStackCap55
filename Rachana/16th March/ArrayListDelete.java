package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDelete {

	public static void main(String[] args) {
	
		ArrayList<String> list=new ArrayList<String>();
		list.add("Raj");
		list.add("Jungkook");
		list.add("Chim");
		list.add("Joon");
		list.remove(1);
	
		System.out.println(list);
		
	}

}

