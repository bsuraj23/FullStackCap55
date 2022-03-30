class Animal{

 
  String name;
  public void eat() {
    System.out.println("I can eat dog food");
  }
}


class Dog extends Animal {


  public void display() {
    System.out.println("My name is " + name);
  }
	  
  public void bark() {
	    System.out.println("I can bark");
	  }
  
}

class InheritanceEx {
  public static void main(String[] args) {


    Dog dachshund = new Dog();

   
    dachshund.name = "oreo";
    dachshund.display();
    dachshund.eat();
    dachshund.bark();

  }
}
