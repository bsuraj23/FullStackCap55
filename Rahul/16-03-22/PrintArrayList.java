package com.selfstudy;

import java.util.ArrayList;

public class PrintArrayList {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();

		array.add("Apple");
		array.add("Mango");
		array.add("Orange");
		array.add("Banana");
		array.add("Melon");

		System.out.println("Elements of list are:");
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i) + " ");
		}
	}
}