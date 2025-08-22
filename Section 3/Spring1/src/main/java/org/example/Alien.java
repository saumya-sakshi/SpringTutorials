package org.example;

public class Alien {
    private int age;
    //private Laptop lap = new Laptop();// but we dont want this way we want to inject as we are supposed to do in spring

    private Laptop lap;

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //System.out.println("Setter Called"); //to check if the property in xml is calling setter or not to set inject
        this.age = age;
    }

    public Alien(){
        //System.out.println("Object Created");
    }

    public void coding (){
        System.out.println("Coding");
        lap.compile();
    }
}
