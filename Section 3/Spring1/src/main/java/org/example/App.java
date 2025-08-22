package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // this line basically creates a container for you IOC container.
        //using this container we are getting this object.
        Alien  a =(Alien) context.getBean("alien");
        a.coding();

        /**
         * Exception in thread "main" java.lang.IllegalStateException: BeanFactory not initialized or already closed - call 'refresh' before accessing beans via the ApplicationContext
         * 	at org.springframework.context.support.AbstractRefreshableApplicationContext.getBeanFactory(AbstractRefreshableApplicationContext.java:169)
         * 	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1272)
         * 	at org.example.App.main(App.java:14)
         * 	we get this error while using above way
         * 	we are getting the container, but it is not getting the class
         * 	it will look for the xml file in the class path ie main directory
         * 	in that we need to create a folder named resources - we need to create a xml file
         * 	and in the ClassPathXmlApplicationContext() - we need to mention that file name
         * beans are objects managed by spring framework
         *
         */

        System.out.println("Hello World!");
    }
}
