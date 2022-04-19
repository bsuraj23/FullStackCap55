package com.jpaday1;

//function with parameters an with return type

public class par4 {

	public static void main(String[] args) {
		ex4 obj4=new ex4();
		System.out.println(obj4.multiply(4, 3));
		System.out.println(obj4.names("Rahul "));
		

	}

}

class ex4{
	String nam="Raj";
	
	int multiply(int a,int b) {
		
		return a*b;
		
	}
	
	String names(String name) {
		String n=name+nam;
		return n;
		
	}
	
}