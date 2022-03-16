package comparablecheck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class comparatorcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e1=new employee(1,"Archana",1000);
		employee e2=new employee(2,"bob roy",3000);
		employee e3=new employee(3,"cianthi",600);
		employee e4=new employee(4,"dhru",10000000);
	
	ArrayList<employee>list=new ArrayList<employee>();
	
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
	
	System.out.println("Based on name comparision");
	Collections.sort(list,new NameComparator());
	Iterator it=list.iterator();
	while(it.hasNext()) {
		employee emp=(employee)it.next();
		System.out.println(emp.id+" "+emp.salary+" "+emp.name);
	}
	System.out.println("******************");
	
	System.out.println("Based on salary comparision");
	Collections.sort(list,new SalaryComparator());
	Iterator sit=list.iterator();
	while(sit.hasNext()) {
		employee emp=(employee)sit.next();
		System.out.println(emp.id+" "+emp.salary+" "+emp.name);
	}
	System.out.println("******************");
	}

}
