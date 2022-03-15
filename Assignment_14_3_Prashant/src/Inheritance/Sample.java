package Inheritance;
class Parent{
	void printloc() {
		System.out.println("In Parent Class");
	}
}

class Child extends Parent{
	void printloc() {
		System.out.println("In Child Class");
	}
}
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent obj=new Child();
		obj.printloc();
	}

}
