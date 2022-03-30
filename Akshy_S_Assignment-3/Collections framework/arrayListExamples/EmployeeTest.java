package arrayListExamples;
import java.util.ArrayList;

class Employee{
	int id;
	String name;
	int sal;
	Employee(int id, String name, int sal){
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
}
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Akshy",200000);
		Employee e2 = new Employee(102,"Arya",300000);
		Employee e3 = new Employee(103,"Prashant",400000);
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		System.out.println(list);
	}

}
