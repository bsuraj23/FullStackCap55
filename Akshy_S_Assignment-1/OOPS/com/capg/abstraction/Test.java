package com.capg.abstraction;

public class Test {

	public static void main(String[] args) {
		Company a = new Academy();
		a.trainings();
		a.finance();
		
		Operations p = new Operations();
		int sum = p.add(5, 3);
		int sub = p.sub(7, 2);
		System.out.println(sum);
		System.out.println(sub);
	}

}
