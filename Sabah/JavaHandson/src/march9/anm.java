package march9;

abstract class Animal {
	 public abstract void animalSound();
	 public void sleep() {
	 System.out.println("Zzz");
	 }}
	class Cat extends Animal {
	 public void animalSound() {
	 System.out.println("The cat says: meow meow");
	 }}
	class anm {
	 public static void main(String[] args) {
	 Cat myCat = new Cat();
	 myCat.animalSound();
	 myCat.sleep();
	 }}