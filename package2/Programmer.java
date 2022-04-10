package package2;

class Employee{  //parent class
	
	 float salary=40000;  
}  

public class Programmer extends Employee{   //Programmer is the child class
	
	 int bonus=10000;  

	public static void main(String[] args) {
		
		 Programmer p=new Programmer();  
		 System.out.println("Programmer salary is:"+p.salary);  
		 System.out.println("Bonus of Programmer is:"+p.bonus);  
		

	}

}
