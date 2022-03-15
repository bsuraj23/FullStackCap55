package Java;

public class polymorphism {
	public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	}

	class Pig extends polymorphism {
	  public void animalSound() {
	    System.out.println("The pig says: wee wee");
	  }
	}

	class Dog extends polymorphism {
	  public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }
	

	public static void main(String[] args) {
		polymorphism myAnimal = new polymorphism();  // Create a Animal object
	    polymorphism myPig = new Pig();  // Create a Pig object
	    polymorphism myDog = new Dog();  // Create a Dog object
	    myAnimal.animalSound();
	    myPig.animalSound();
	    myDog.animalSound();
	  }

	}


