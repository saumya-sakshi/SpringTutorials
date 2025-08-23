package org.example;



import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloServlet extends HttpServlet {

    /**
     * Whenever you want your servlet to work you need define a method service()
     */

    public void service(HttpServletRequest req, HttpServletResponse res) {
        System.out.println("In Service");
    }

}
