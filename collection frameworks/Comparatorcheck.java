package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Comparatorcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1=new Employee(1,"kyati",23456);
Employee e2=new Employee(2,"atirs",23450);
Employee e3=new Employee(3,"kiran",70000);
Employee e4=new Employee(4,"yami",60000);
ArrayList<Employee> list=new ArrayList<Employee>();
list.add(e1);
list.add(e2);
list.add(e3);
list.add(e4);

System.out.println("Based on name comparision");
Collections.sort(list,new NameComparator());
Iterator it=list.iterator();
while(it.hasNext()) {
	Employee emp=(Employee)it.next();
	System.out.println(emp.id+" "+emp.sal+" "+emp.name);
	
}
System.out.println("***************************");
System.out.println("Based on salary comparision");

Collections.sort(list,new SalaryComparator());
Iterator it1=list.iterator();
while(it1.hasNext()) {
	Employee emp=(Employee)it1.next();
	System.out.println(emp.id+" "+emp.sal+" "+emp.name);
	
}



	}

}
