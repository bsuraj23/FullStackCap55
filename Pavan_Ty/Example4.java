package com.classobject;
//function with parameters an with return type
public class Example4 {

	public static void main(String[] args) {
		ex4 obj4=new ex4();
		System.out.println(obj4.multiply(5, 6));
		System.out.println(obj4.names("pav"));
		

	}

}

class ex4{
	String nam="an";
	
	int multiply(int a,int b) {
		
		return a*b;
		
	}
	
	String names(String name) {
		String n=name+nam;
		return n;
		
	}
	
}