package com.capg.set;

import java.util.*;

//Enock Harris Suhas F
public class SetsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set Doesn't Allow the Duplicate Values
		
		//HashSet<String> set=new HashSet<String>();  //->It prints the elements in sorted order and allow Null Values
		//LinkedHashSet<String> set=new LinkedHashSet<String>();  //->It prints the elements in Insertion order and allow Null Values
		TreeSet<String> set=new TreeSet<String>(); //->It prints the elements in NumericAlphabets sorted order and Doesn't allow Null Values
		
		set.add("f");
		set.add("a");
		set.add("d");
		set.add("2");
		set.add("c");
		set.add("e");
		set.add("k");
		set.add("j");
		set.add("b");
		set.add("1");
		
		//set.add(null); //In TreeSet Null values are not allowed It throws NullPointerException
		//set.add(null);  //Set allow Multiple Null Values but it prints only one null at first
		
		//System.out.println("HashSet Values -> "+set);
		//System.out.println("LinkedHashSet Values -> "+set);
		System.out.println("TreeSet Values -> "+set);
		

	}

}
