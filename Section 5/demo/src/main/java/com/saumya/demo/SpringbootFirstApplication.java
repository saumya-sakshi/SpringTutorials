package com.saumya.demo;

import com.saumya.demo.model.Alien;
import com.saumya.demo.model.Laptop;
import com.saumya.demo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootFirstApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootFirstApplication.class, args);

LaptopService service = context.getBean(LaptopService.class);

//		Alien a = context.getBean(Alien.class);
//		System.out.println(a.getAge());
//		a.code();

		Laptop lap= context.getBean(Laptop.class);
		service.addLaptop(lap);

	}

}
