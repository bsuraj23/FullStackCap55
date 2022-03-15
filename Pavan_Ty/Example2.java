package com.classobject;
//function without parameters an with return type
public class Example2 {

	public static void main(String[] args) {
		ex2 obj2=new ex2();
		System.out.println(obj2.multiply());

	}

}
class ex2{
	
	int multiply() {
		int a=5;
		int b=3;
		return a*b;
	}
}