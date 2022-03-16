package Assigment16Mar;

public class try_catch_example {

	void m()
	{
		int a=50/0;
	}
	void p()
	{
		try {
			m();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception handled");
		}
		finally {
			System.out.println("This is finally block");
		}
	}
	public static void main(String[] args) {
		try_catch_example obj=new try_catch_example();
		obj.p();
		System.out.println("No other exceptions present");
		System.out.println("There can be try without catch");
		System.out.println("There cannot be catch without try block");
		System.out.println("There cannot be finally without try block");
	}

}