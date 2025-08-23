package com.saumya.demo.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {

    @Override
    public void compile(){
        System.out.println("compiling in desktop");
    }
}
