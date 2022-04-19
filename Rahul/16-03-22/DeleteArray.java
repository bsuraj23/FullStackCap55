package com.selfstudy;

import java.util.ArrayList;

public class DeleteArray {

	public static void main(String[] args) {
		
		ArrayList<String> fruit = new ArrayList<String>();
		
		fruit.add("Apple");
		fruit.add("Mango");
		fruit.add("Banana");
		fruit.add("Melon");
		System.out.println(fruit);
		fruit.remove(0);
		System.out.println(fruit);
	}
}