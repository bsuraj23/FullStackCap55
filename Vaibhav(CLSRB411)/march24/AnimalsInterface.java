package com.march24;

interface Animals{
	void speak();
}
class Lion implements Animals{
	public void speak() {System.out.println("Roar");};
}

class Cow implements Animals{
	public void speak() {System.out.println("Mooo");};
}

class Cat implements Animals{
	public void speak() {System.out.println("Meow");};
}

public class AnimalsInterface {
public static void main(String[] args) {
	Lion l1 = new Lion();
	l1.speak();
	Cow c1 = new Cow();
	c1.speak();
	Cat kitty = new Cat();
	kitty.speak();
}
}
