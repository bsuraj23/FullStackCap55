package ArrayList;

import java.util.ArrayList;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1=new Employee(101,"abc",80);
		Employee e2=new Employee(202,"bbb",100);
		Employee e3=new Employee(303,"ccc",987);
	
		ArrayList<Employee> list=new ArrayList<Employee>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println(list);
	}

}
