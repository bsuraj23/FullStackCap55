package Encapsulation;

public class Test {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(100);
		e.setName("Akshy");
		e.setSalary(200000);
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
	}

}
