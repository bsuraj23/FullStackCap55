package com.capg.LinkedList;

import java.util.*;
public class LisnkedListExamples {

	//Enock Harris Suhas F
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();
		LinkedList<String> list1=new LinkedList<String>();
		System.out.println("Checking List is Empty or not -> "+list.isEmpty());
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		list1.add("Enock");
		list1.add("Harris");
		list1.add("Suhas");
		list1.add("F");
		
		list.addAll(list1);
		
		System.out.println("List items : "+list);
		
		list.addFirst("Start");
		System.out.println("List items After adding first element : "+list);
		
		list.addLast("End");
		System.out.println("List items After adding last element : "+list);
		
		list.add(3,"Middle");
		System.out.println("List items After adding element at particular index : "+list);
		
		System.out.println("Checking List is Empty or not -> "+list.isEmpty());
		
		System.out.println("Retrieving head of the list -> "+list.peek());
		
		System.out.println("Removing and Retrieving head of the list -> "+list.remove());
		System.out.println("After Removing "+list);
		
		System.out.println("Removing and Retrieving last of the list -> "+list.pollLast());
		System.out.println("After Removing "+list);
		
		System.out.println("Removing and Retrieving particular index of the list -> "+list.remove(3));
		System.out.println("After Removing "+list);
		
		System.out.println("List 1 elements : "+list1);
		
		System.out.println("List elements : "+list);
		
		System.out.println("Checking List is Empty or not -> "+list.isEmpty());
		System.out.println("Checking List is Empty or not -> "+list1.isEmpty());
		
		System.out.println("Removing all the elements in the list "+list.removeAll(list));
		System.out.println("List elements : "+list);
		System.out.println("Checking List is Empty or not -> "+list.isEmpty());
		list.add(null);
		System.out.println("List elements : "+list);
		System.out.println("Checking List is Empty or not -> "+list.isEmpty());
		

	}

}
