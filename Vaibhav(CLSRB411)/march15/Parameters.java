package com.march15;

class ex1{
	void  add() {
		int a=2;
		int b=5;
		System.out.println(a+b);
	}
	
}

class ex2{
	
	int multiply() {
		int a=5;
		int b=3;
		return a*b;
	}
}

class ex3{
	
	void add(int a,int b) {
		
		System.out.println(a+b);
	}
}

class ex4{
	String nam="Ram";
	
	int multiply(int a,int b) {
		
		return a*b;
		
	}
	
	String names(String name) {
		String n= name + nam;
		return n;
		
	}
	
}

public class Parameters {
public static void main(String[] args) {
	ex1 obj1=new ex1();
	obj1.add();
	
	ex2 obj2=new ex2();
	System.out.println(obj2.multiply());
	
	ex3 obj3=new ex3();
	obj3.add(5,6);

	ex4 obj4=new ex4();
	System.out.println(obj4.multiply(5, 6));
	System.out.println(obj4.names("JaiShree"));
}
}
