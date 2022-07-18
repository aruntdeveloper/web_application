package com.pack;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
public class First extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
        String i=req.getParameter("name");
        req.setAttribute("name",i);
        int j=Integer.parseInt(req.getParameter("number"));
        int b=j%2;
        if (b==0){
            PrintWriter out = res.getWriter();
            out.println("Your name is"+i);
            out.println("You entered Even NUmber");
        }
        else {
            RequestDispatcher r =req.getRequestDispatcher("second");
            r.forward(req,res);
        }
    }
}
