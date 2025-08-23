package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

    /**
     * After addding @Component at top of all classes we dont need to create these beans
     * we just need to inform spring where to scan using
     @ComponentScan("org.example")
     */

//
//    @Bean(name = {"alien"})
//    public Alien alien( @Autowired Computer com){ //@Qualifier("laptop")
//        Alien obj = new Alien();
//        obj.setAge(25);
//        //obj.setCom(desktop()); // but this will be tightly coupled so we will change
//        obj.setCom(com);
//        return obj;
//    }
//    /**
//     * By default the bean name is your method name;
//     * we can change that by using attribute in @bean that is name in which we can either give 1 name or give an array of names
//     * by default scope is singleton
//     * @return
//     */
//
//    //
//    // @Bean(name = {"com","desktop1"})
//    //@Scope(value = "prototype")
//    @Bean
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }


}
