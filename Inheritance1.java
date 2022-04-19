package com.capg.Inheritance;

import java.util.Scanner;

class Student{
	String studentName;
	String college;
	int id;
	public Student(String studentName, String college, int id) {
		super();
		this.studentName = studentName;
		this.college = college;
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void getDetails() {
		System.out.println("Student Id: "+id);
		System.out.println("Student Name: "+studentName);
		System.out.println("Collge: "+college);
	}
}
class EngineeringStudent extends Student{
	String stream;

	public EngineeringStudent(String studentName, String college, int id,String stream) {
		super(studentName, college, id);
		this.stream=stream;
		// TODO Auto-generated constructor stub
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}
	
	public void getDetails() {
		System.out.println("Student Id: "+id);
		System.out.println("Student Name: "+studentName);
		System.out.println("Collge: "+college);
		System.out.println("Stream: "+stream);
	}
}

public class PracticeQuestion3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		
		if(input.equals("Student")) {
			String col=" ";
			int id=sc.nextInt();
			String name=sc.next();
			String col1=sc.next()+col+sc.next();
			Student s=new Student(name,col1,id);
			s.getDetails();
			}
		else if(input.equals("EngineeringStudent")) {
			//String col1=" ";
			int id=sc.nextInt();
			String name=sc.next();
			String col=sc.next();
			String stream=sc.next();
			EngineeringStudent es=new EngineeringStudent(name,col,id,stream);
			es.getDetails();
		}
		else {
			System.out.println("INVALID INPUT");
		}
		// TODO Auto-generated method stub
	
	}

}
