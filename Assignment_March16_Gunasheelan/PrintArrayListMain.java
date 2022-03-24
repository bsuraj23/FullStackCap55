package com.arrays;

import java.util.ArrayList;
 
public class PrintArrayListMain {
 
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
 
        arr.add("Apple");
        arr.add("Orange");
        arr.add("Mango");
        arr.add("Banana");

	System.out.println("Array list before removing");
 
        System.out.println("Elements of ArrayList are:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i) + " ");
        }
        arr.remove("Banana");
         
        System.out.println("ArrayList after removing :");
       
        System.out.println("Elements of ArrayList are:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i) + " ");
        }


	
    }
}