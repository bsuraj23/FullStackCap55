package Assignment15Mar;

class base{  
	void f1call(){
		System.out.println("Parent Branch");
		}  
}  
class subclass extends base{  
	void f2call(){
		System.out.println("Child Branch");
		}  
}  

class SingleLevel_Inheritance{  
public static void main(String args[]){ 
	System.out.println("This is example of Single Inheritance \n");
	subclass c=new subclass();  
	c.f1call();  
	c.f2call();   
}
} 