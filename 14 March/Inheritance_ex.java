package Assignment14Mar;

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
class Inheritance_ex{  
public static void main(String args[]){  
	GrandChild g=new GrandChild();  
	g.f1call();  
	g.f2call();  
	g.f3call();  
}
} 


