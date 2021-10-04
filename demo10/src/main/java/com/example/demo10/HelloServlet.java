package com.example.demo10;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String f = request.getParameter("fname");
        String s = request.getParameter("lname");
        String e = request.getParameter("email");
        String p = request.getParameter("pass");
        String cp = request.getParameter("Cpass");

        try {
            Connection con = MyConnection.connect();
            Statement stmt = con.createStatement();

            int row_count = stmt.executeUpdate("insert into register(fname,lname,email,pass,Cpass) values('"+f+"','"+s+"','"+e+"','"+p+"','"+cp+"')");

        } catch(Exception ee) {
            System.out.println("DB error :"+ee);
        }
    }
    public void destroy() {
    }
}