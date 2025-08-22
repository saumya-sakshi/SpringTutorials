package org.example;


import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context= new ApplicationContext();

        Alien a = new Alien();
        a.coding();

        System.out.println("Hello World!");
    }
}
