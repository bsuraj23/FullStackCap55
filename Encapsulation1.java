package com.capg.encapsulation;

public class Encapsulation1 {
	
	int id;
	String name;
	int salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation1 e=new Encapsulation1();
		e.setId(100);
		e.setName("Enock");
		e.setSalary(30000);
		
		System.out.println("Employee Id : "+e.getId());
		System.out.println("Employee Name : "+e.getName());
		System.out.println("Employee Salary : "+e.getSalary());
	

	}

}
//ENOCK HARRIS SUAHS F