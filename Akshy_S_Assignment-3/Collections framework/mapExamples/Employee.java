package mapExamples;

import java.util.HashMap;


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
		HashMap<Integer,Object> s = new HashMap<Integer,Object>();
		Employee1 e = new Employee1(1,"cfg");
		Employee1 e1 = new Employee1(2,"agf");
		s.put(1,e);
		s.put(2,e1);
		System.out.println(s);
	}

}
