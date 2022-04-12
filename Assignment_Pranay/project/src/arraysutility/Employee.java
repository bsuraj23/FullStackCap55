package arraysutility;

import java.util.Objects;


//Entity Class
public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
	//Comparing based on id
	@Override
	public int compareTo(Employee other) {
		// TODO Auto-generated method stub
		return this.id- other.id;
	}
	
	
	
	
}