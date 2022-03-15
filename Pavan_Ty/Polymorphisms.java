package com.polymorphism;


class Animals {
    public void sing() {
        System.out.println("tweet tweet tweet");
    }
}
class Dog extends Animals {
	public void sing() {
	    System.out.println("bow bow");
	}
	}
class lion extends Animals {
	public void sing() {
	    System.out.println("roar roar");
	}
	}

public class Polymorphisms {
    public static void main(String [] args) {

    	Animals a;
    	a=new Dog();
    	a.sing();
    	a=new lion();
    	a.sing();
    	
   	
    	
    }
}

