
class Animal {
  String name;
  
  public void eat() {
    System.out.println("Pedigree");
  }
}


class Dog extends Animal {

  public void display() {
    System.out.println("Dogs name is " + name);
  }
}

class inheritance{
	
  public static void main(String[] args) {
    Dog l = new Dog();
    l.name = "Tommy";
    l.display();
    l.eat();

  }
}