package com.capg.servlet.lab2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
**
**@author : Dola Sai Ram
**
**/


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Map<String, String> m= new HashMap<String, String>();
       public void init()
       {
    	   m.put("yash", "1234");
    	   m.put("jas", "abc");
    	   m.put("pavan", "pqr");
    	   m.put("taran", "xyz");
       }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("t1");
		String pass = request.getParameter("t2");
		if(m.containsKey(uname)&& m.containsValue(pass))
		{
				RequestDispatcher dis = request.getRequestDispatcher("WelcomeServlet");
				dis.forward(request, response);
		}
		else
		{
			PrintWriter out =  response.getWriter();
			out.println("<h1>Invalid data</h1>");
			RequestDispatcher dis = request.getRequestDispatcher("login.html");
			dis.include(request, response);
		}
	}

}
