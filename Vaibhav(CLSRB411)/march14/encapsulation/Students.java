package com.march14.encapsulation;

public class Students {
	public static void main(String args[]) {
		StudentInfo encap = new StudentInfo();
		encap.setName("James");
		encap.setAge(20);
		encap.setIdNum("12343ms");
		System.out.print("Name : " + encap.getName() + "; Age : " + encap.getAge()+";");
		}
}
