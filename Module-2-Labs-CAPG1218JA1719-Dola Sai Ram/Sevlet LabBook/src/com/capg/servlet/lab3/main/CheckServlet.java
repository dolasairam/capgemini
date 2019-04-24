package com.capg.servlet.lab3.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.capg.servlet.lab3.service.ITrainingservice;
import com.capg.servlet.lab3.service.Trainingservice;
/**
**
**@author : Dola Sai Ram
**
**/


/**
 * Servlet implementation class CheckServlet
 */
@WebServlet("/CheckServlet")
public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	ITrainingservice ts=new Trainingservice();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		int id=Integer.parseInt(request.getParameter("id"));
		HttpSession session=request.getSession();
		session.setAttribute("ClickID", id);
		int seats=Integer.parseInt(request.getParameter("st"));
		if(seats>0)
		{
			seats=seats-1;
			out.println("Hi you have successfully enrolled for"+" "+request.getParameter("nm"));
			out.println("<br><a href='TrainingServlet'>Go back</a>");
			System.out.println(ts.UpdateTraining(id,seats));
			
		}
		else
		{
			out.println("No Seats avaliable");
			out.println("<br><a href='TrainingServlet'>Go back</a>");
		}
		
	}

}
