package com.capg.map;

import java.util.*;

//Enock Harris Suhas F
public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> set=new HashMap<Integer,String>();
		
		set.put(1,"Enock");
		set.put(2,"Harris");
		set.put(3,"Suhas");
		set.put(5,"F");
		set.put(6,"F");
		set.put(null,"Chinnuf");
		set.put(null,"abc");
		
		set.put(7,null);
		set.put(5,null);
		set.put(4, "Chinnu");
		
		System.out.println("Accessing particular element using key ->"+set.get(5));
		
		System.out.println(set);
	}

}
