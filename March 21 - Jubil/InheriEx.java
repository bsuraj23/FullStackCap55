class Grandparent{
	public void Print()
	{
		System.out.println("Child accessing Grandparent class");
	}
}

class Parent extends Grandparent{
	public void Display()
	{
		
		System.out.println("Child accessing Parent class");
	}
}
class Child extends Parent{
	public void View()
	{
		
		System.out.println("Child class");
	}
}
public class InheriEx {
	public static void main(String [] args) {
		Grandparent g=new Grandparent();
		g.Print();
		Child c=new Child();
		c.Display();
		
	}

}
