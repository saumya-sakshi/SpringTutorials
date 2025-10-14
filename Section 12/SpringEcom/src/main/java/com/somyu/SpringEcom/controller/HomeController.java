package com.somyu.SpringEcom.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping("/hello")
    @CrossOrigin
    public String greet(){
        return "Welcome to the ECOM";
    }
}
