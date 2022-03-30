package Assignment21Mar;

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
class Grandchild_Ex{  
public static void main(String args[]){ 
	System.out.println("This is example of MultiLevel Inheritance \n");
	GrandChild g=new GrandChild();  
	g.f1call();  
	g.f2call();  
	g.f3call();  
}
} 