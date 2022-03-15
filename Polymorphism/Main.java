package com.Polymorphism;

class Main {

    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myCat = new Cat();  // Create a Pig object
        Animal mydog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myCat.animalSound();
        mydog.animalSound();
    }

}

