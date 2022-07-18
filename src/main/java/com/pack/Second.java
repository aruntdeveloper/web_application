package com.pack;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;

public class Second extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        PrintWriter p = res.getWriter();
        String i = (String) req.getAttribute("name");
        p.println("Your name: "+i);
        p.println("You Entered Odd Number");

    }
}
