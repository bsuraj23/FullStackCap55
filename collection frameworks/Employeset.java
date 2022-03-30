package collections;
import java.util.ArrayList;
public class Employee {
int id;
String name;
int sal;
public Employee(int id ,String name,int sal) {
	this.id=id;
	this.name=name;
	this.sal=sal;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
 }
}
public class Employeetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(901,"Raga",30000);
		Employee e2=new Employee(902,"Nile",30000);
		Employee e3=new Employee(903,"Razi",30000);
ArrayList li=new ArrayList();
li.add(e1);
li.add(e3);
li.add(e2);
System.out.println(li);
	}

}
