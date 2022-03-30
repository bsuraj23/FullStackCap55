package Overloading;

public class Employee {
	public void display(int id) {
		System.out.println(id);
	}
	public void display(int id, String name) {
		System.out.println(id+" "+name);
	}
	public void display(int id, String name, int salary) {
		System.out.println(id+" "+name+" "+salary);
	}
}
