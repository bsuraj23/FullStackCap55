package com.enscapsulation;

 class Student {
    private String name;
    private int age;
    public void setName1(String newName) {
        name = newName;
    }
    public String getName1 () {
        return name;
    }
    public void setName (String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }
    public void setAge(int newAge) {
        age = newAge;
    }
    public int getAge () {
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
         s.setName1 ("Pavan Ty");
        s.setAge(21); 
        System.out.println(s.getName1());
        System.out.println(s.getAge()) ;
    }
}