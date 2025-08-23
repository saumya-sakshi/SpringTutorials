package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {

    @Value("21")
    private int age;

    /**
     *
     * @param age
     * @param lap
     * if we have this parameterized constructor and in earlier it will give error if we use just one constructor arg in spring.xml
     * <constructor-arg value="21"/>
     * <constructor-arg ref="lap1"/>
     * it checks the sequence and assigns respectively
     * we can solve this by 1st method - mention the type but again it can cause error if we have multiple var of same type
     * now 2nd method is index which again use sequence to identify and map the vars
     * now 3rd  if we annotate here using {@link ConstructorProperties } and mention the names of var in array
     * we can use it in spring.xml using name attribute and sequence wont matter
     * **/
//    @ConstructorProperties({"age","lap"})
//    public Alien(int age, Computer com) {
//        this.age = age;
//        this.com = com;
//    }
//private Laptop lap = new Laptop();// but we dont want this way we want to inject as we are supposed to do in spring

    @Autowired
    @Qualifier("laptop")
    private Computer com;
    /**
     * there are 3 types of autowiring
     * 1. Field Injection
     * 2. Constructor Injection
     * 3. setter injection
     *
     * in betweeen Primary and Qualifier - Qualifier has more peference
     *
     */

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //System.out.println("Setter Called"); //to check if the property in xml is calling setter or not to set inject
        this.age = age;
    }

    public Alien(){
        System.out.println("Alien Object Created");
    }

//    public Alien(int age){
//        this.age=age;
//        System.out.println("para constructor called");
//        /**
//         * now we want to assign value not with the injected setter,
//         * we want to use this constructor to have value initialized at he time of object creation
//         */
//    }

    public void coding (){
        System.out.println("Coding");
        com.compile();
    }
}
