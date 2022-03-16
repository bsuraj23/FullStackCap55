package com.arraylist;

import java.util.ArrayList;

public class deleteArray {
	  public static void main(String[] args) { 
		    ArrayList<String> cars = new ArrayList<String>();
		    cars.add("cat");
		    cars.add("dog");
		    cars.add("snake");
		    cars.add("rabbit");
		    System.out.println(cars);
		    cars.remove(0);
		    System.out.println(cars);
		  } 
		}