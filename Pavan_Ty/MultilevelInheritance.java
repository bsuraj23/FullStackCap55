package com.differntinheritance;

class Bird{  
void sing(){
	System.out.println("bird is singing");
	}  
}  
class Dogs extends Bird{  
void bark()
{
	System.out.println("Dog is barking");
	}  
} 

class Cat extends Dogs{
	void meow() {
	System.out.println("cat is meowing");
}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c=new Cat();  
	 c.bark();
	 c.sing();
	 c.meow();
	}


	}



