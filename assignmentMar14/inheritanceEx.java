package assignmentMar14;

class Parent{  
	void parentFun(){
		System.out.println("Parent Function");
		}  
}  
class Child extends Parent{  
	void childFun(){
		System.out.println("Child Function");
		}  
}  
class GrandChild extends Child{  
	void grandCFun(){
		System.out.println("GrandChild Function");
		}  
}  
class inheritanceEx{  
public static void main(String args[]){  
	GrandChild g=new GrandChild();  
	g.parentFun();  
	g.childFun();  
	g.grandCFun();  
}
} 