package com.saumya.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootFirstApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootFirstApplication.class, args);


		Alien a = context.getBean(Alien.class);
		a.code();

//		Laptop laptop= context.getBean(Laptop.class);
//		laptop.compile(); 
	}

}
