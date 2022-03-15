package com.abstractions;



abstract class Dog {

	public void sleep() {
		System.out.println("Sleep");
	}
public abstract void animalSound();
}
class Cat extends Dog {
	public void animalSound() {
		System.out.println("The Dog says: Bow Bow");
	}
}
class Abstraction{
	public static void main(String[] args) {
		Cat myCat = new Cat();
		myCat.animalSound();
		myCat.sleep();
	}
}