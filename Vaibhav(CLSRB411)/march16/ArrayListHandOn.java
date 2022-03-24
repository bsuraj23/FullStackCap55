package com.march16;

import java.util.*;

public class ArrayListHandOn {
	public static void main(String[] args) {
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    cars.remove(0);
	    System.out.println(cars);
	    cars.add("EagonR");
	    System.out.println("Elements of ArrayList are:");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i) + " ");
        }
	  }
}
