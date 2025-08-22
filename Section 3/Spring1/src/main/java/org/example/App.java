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
        /**
         * Exception in thread "main" java.lang.IllegalStateException: BeanFactory not initialized or already closed - call 'refresh' before accessing beans via the ApplicationContext
         * 	at org.springframework.context.support.AbstractRefreshableApplicationContext.getBeanFactory(AbstractRefreshableApplicationContext.java:169)
         * 	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1272)
         * 	at org.example.App.main(App.java:14)
         * 	we get this error while using above way
         * 	we are getting the container, but it is not getting the class
         * 	it will look for the xml file in the class path ie main directory
         * 	in that we need to create a folder named resources - we need to create a xml file
         * and in the ClassPathXmlApplicationContext() - we need to mention that file name
         * beans are objects managed by spring framework
         * object is created at line 12 as it is asking spring to create all the objects mentioned in that xml config file
         * in line 30 and 31 we are just calling and using that object
         * it will create objects for all the beans present in the xml configuration irrespective if it is duplicate or not.
         *
         */
        Alien  a =(Alien) context.getBean("alien1");
        a.coding();
        //a.setAge(21); // i dont want to assign here i want to inject the value like we do in spring so we will do that in spring.xml
        System.out.println(a.getAge());








        /**
         * Alien obj2 = (Alien) context.getBean("alien1");
         * //        System.out.println(obj2.age);
         * //
         * //        obj2.coding();
          */
/**will these above will create 1 object or 2 object.
         //we will be creating 1 object but 2 references, referring to the same object.
         //Here you can see same age is referred by both references that means there is only one object
         //
         *
         */


        /**
         * when we use scope as prototype and we dont call the getBean()
         * the object wont be created in line 12 for that class
         * if the scope is singleton the object will be created by default while loading the container.
         */



        /**to avoid typecasting in getbean we can use the follow
        Alien  obj =context.getBean("alien1",Alien.class);?**/




        System.out.println("Hello World!");
    }
}
