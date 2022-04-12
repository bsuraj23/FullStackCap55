package assignmentMar15;

class base{  
	void parentFun(){
		System.out.println("Parent Class");
		}  
}  
class subclass extends base{  
	void childFun(){
		System.out.println("Child Class");
		}  
}  

class singleLevelInherit{  
public static void main(String args[]){ 
	System.out.println("This is example of Single Inheritance \n");
	subclass c=new subclass();  
	c.parentFun();  
	c.childFun();   
}
} 
