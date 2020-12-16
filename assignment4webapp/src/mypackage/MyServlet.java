package mypackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet
{
   private static final long serialVersionUID = 1L;
  
public MyServlet()
{
super();
}

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
   {
       PrintWriter out=response.getWriter();  
       String first=request.getParameter("first");
       String last=request.getParameter("last");
       String sid=request.getParameter("sid");
       String telephone=request.getParameter("telephone");
       String address=request.getParameter("address");
      
       out.println("First Name "+first);
       out.println("<br>Last Name "+last);
       out.println("<br>Student Id "+sid);
       out.println("<br>Telephone "+telephone);
       out.println("<br>Address "+address);
   }

  
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
   {
       doGet(request, response);
   }
}