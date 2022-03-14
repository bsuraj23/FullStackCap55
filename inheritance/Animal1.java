package com.inheritance;
public class Animal1
{
    void eat()
    {
        System.out.println("eating");
    }

    public static void main(String[] args) {
        catt c = new catt();
        c.sleep();
        c.eat();


        StreetDog d = new StreetDog();
        d.bark();
        d.eat();

    }
}
class StreetDog extends Animal
{
    void bark()
    {
        System.out.println("barking");

    }
}
class catt extends Animal
{
    void sleep()
    {
        System.out.println("sleeping");

    }
}






