package setExamples;

import java.util.HashSet;

class Employee1{
	int id;
	String name;
	Employee1(int id, String name){
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return "Employee [id: " +id+" name: "+name+" ]";
	}
}

public class Employee {

	public static void main(String[] args) {
		HashSet<Object> s = new HashSet<Object>();
		Employee1 e = new Employee1(1,"cfg");
		Employee1 e1 = new Employee1(2,"agf");
		s.add(e);
		s.add(e1);
		System.out.println(s);
	}

}
