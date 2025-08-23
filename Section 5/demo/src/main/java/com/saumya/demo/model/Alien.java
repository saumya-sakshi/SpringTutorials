package com.saumya.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {


    private Computer com;
    @Value("25")
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }
    @Autowired
    @Qualifier("laptop")
    public void setCom(Computer com) {
        this.com = com;
    }



     public void code(){

         com.compile();
         System.out.println("Coding");
     }
}
