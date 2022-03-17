package com.jpaday1;

//function without parameters an with return type

public class par2 {

	public static void main(String[] args) {
		ex2 obj2=new ex2();
		System.out.println(obj2.multiply());

	}

}
class ex2{
	
	int multiply() {
		int a=4;
		int b=5;
		return a*b;
	}
}