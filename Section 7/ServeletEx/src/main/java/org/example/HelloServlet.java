package org.example;



import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class HelloServlet extends HttpServlet {

    /**
     * Whenever you want your servlet to work you need define a method service()
     */

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("In Service");
        res.setContentType("text/html");
       PrintWriter out= res.getWriter();
       out.println("<H1><b>Hello, How are you?<b></H1>");
    }

}
