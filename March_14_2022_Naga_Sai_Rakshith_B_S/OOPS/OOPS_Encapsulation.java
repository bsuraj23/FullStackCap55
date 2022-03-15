package March_14_2022.OOPS;

class Person{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class OOPS_Encapsulation {
    public static void main(String[] args)
    {
        Person person1 = new Person();
        person1.setName("Rakshith");
        System.out.println(person1.getName());

        Person person2 = new Person();
        person2.setName("Raksha");
        System.out.println(person2.getName());
    }
}
