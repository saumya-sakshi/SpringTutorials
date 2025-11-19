package com.somyu.spring_security.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("hello")
    public String greet(HttpServletRequest request) {
        return "Hello Spring Security!" + request.getSession().getId() ;
    }


    @GetMapping("about")
    public String about(HttpServletRequest request) {
        return "About me - Saumya Sakshi" + request.getSession().getId() ;
    }

}
