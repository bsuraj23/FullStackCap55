package Encapsulation;

public class test {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(101);
		e.setName("kira");
		e.setSalary(7000);
		
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());

	}
 //eg: bean
}
