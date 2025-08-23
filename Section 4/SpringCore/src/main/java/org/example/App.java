package org.example;


import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop d  =  context.getBean(Desktop.class);
        d.compile();

//        Desktop d2  =  context.getBean("com",Desktop.class);
//        d2.compile();



        Alien  a = context.getBean(Alien.class);
        a.coding();
        System.out.println(a.getAge());
    }
}
