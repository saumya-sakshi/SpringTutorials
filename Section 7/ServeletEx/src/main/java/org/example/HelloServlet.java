package org.example;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

    /**
     * Whenever you want your servlet to work you need define a method service()
     */

    public void service(HttpServletRequest req, HttpServletResponse res){
        System.out.println("In Service");
    }
}
