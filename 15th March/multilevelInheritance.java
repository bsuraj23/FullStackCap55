
public class multilevelInheritance {
	public static void main(String args[]){ 
		System.out.println("This is example of MultiLevel Inheritance \n");
		GrandChild g=new GrandChild();  
		g.f1call();  
		g.f2call();  
		g.f3call();  
		
		System.out.println("\n The reason behind this is to prevent ambiguity. "
				+ "Consider a case where class B extends class A and Class C and both class A and C have the same method display()."
				+ " Now java compiler cannot decide, which display method it should inherit."
				+ " To prevent such situation, multiple inheritances is not allowed in java");
	}
}

class Parent{  
	void f1call(){
		System.out.println("Parent Branch");
		}  
}  
class Child extends Parent{  
	void f2call(){
		System.out.println("Child Branch");
		}  
}  
class GrandChild extends Child{  
	void f3call(){
		System.out.println("GrandChild Branch");
		}  
}  