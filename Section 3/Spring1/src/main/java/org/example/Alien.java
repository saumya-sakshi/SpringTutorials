package org.example;

public class Alien {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter Called"); //to check if the property in xml is calling setter or not to set inject
        this.age = age;
    }

    public Alien(){
        System.out.println("Object Created");
    }

    public void coding (){
        System.out.println("Coding");
    }
}
