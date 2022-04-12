package com.inheritance;

public class Test {
    public static void main(String[] args) {
        cat c = new cat();
        c.sleep();
        c.eat();
        c.bark();


        Dog d = new Dog();
        d.bark();
        d.eat();


    }
}
