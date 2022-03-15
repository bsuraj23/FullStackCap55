package com.differntinheritance;
class Birds{  
void sing(){
	System.out.println("bird is singing");
	}  
}  
class Dog extends Birds{  
void bark()
{
	System.out.println("Dog is barking");
	}  
} 
public class SingleInheritance {

	public static void main(String[] args) {
	
		Dog d=new Dog();  
		d.bark();  
		d.sing();  
	}

}
