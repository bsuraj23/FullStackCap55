package CapgeminiTraining;
class member
{
	String Name;
	int Age;
	int Pno;
	String Address;
	double Salary;
	public void print() 
	{
		System.out.println("Salary : "+ Salary);
	}
}
class emp extends member
{
	String specialization;
	//System.out.println("specialization : "+ specialization);
}
class manager extends emp
{
	String department;
	//System.out.println("department : "+ department);	
}
public class inheritence {
	public static void main(String[] args) {
		manager m = new manager();
		m.Salary = 300000.0;
		m.print();
	}
}