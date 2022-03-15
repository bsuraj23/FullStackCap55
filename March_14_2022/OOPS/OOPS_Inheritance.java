package March_14_2022.OOPS;

class Walks{
    int no_of_legs;
    public void walking(String name){
        System.out.println(name+" walks with "+this.no_of_legs+" of legs.");
    }
}

class Animal extends Walks{
    String name;

    public Animal(String name, int no_of_legs) {
        this.name = name;
        this.no_of_legs = no_of_legs;
    }
}

public class OOPS_Inheritance {
    public static void main(String[] args)
    {
        Animal animal1 = new Animal("Dog",4);
        Animal animal2 = new Animal("Kangaroo",2);

        animal1.walking(animal1.name);
        animal2.walking(animal2.name);
    }
}
