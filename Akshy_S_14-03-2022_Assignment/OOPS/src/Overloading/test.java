package Overloading;

public class test {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.display(121);
		e.display(121, "Akshy");
		e.display(121, "Akshy", 200000);
	}

}
