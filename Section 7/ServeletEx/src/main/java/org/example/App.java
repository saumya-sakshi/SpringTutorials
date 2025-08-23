package org.example;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws LifecycleException {
        System.out.println("Hello World!");
        Tomcat tomcat = new Tomcat();
        tomcat.start();//it starts the server but it stops as well
        tomcat.getServer().await();// will keep the server running
    }
}
