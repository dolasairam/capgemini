package com.capg.servlet.lab3.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.capg.servlet.lab3.service.ITrainingservice;
import com.capg.servlet.lab3.service.Trainingservice;
/**
**
**@author : Dola Sai Ram
**
**/


/**
 * Servlet implementation class TrainingServlet
 */
@WebServlet("/TrainingServlet")
public class TrainingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		ITrainingservice ts=new Trainingservice();
		out.print("<html><body>");
		out.print("<h1>Training Table</h1>");
		out.println("<table border=1>");
		out.println("<tr><th>Training_Id</th><th>Training_Name</th><th>Available_Seats</th><th>Enrollment</th>");
		ts.ShowTraining().forEach(e->{
			out.println("<tr><td>"+e.getTid()+"</td>"+"<td>"+e.getTname()+"</td>"+"<td>"+e.getAseats()
			+"</td>"+"<td> <a href=CheckServlet?id="+ e.getTid() +"&st="+ e.getAseats()+"&nm="+e.getTname()+">Enroll</a> </td></tr>");
		});
		out.println("</table></body></html>");
	}

}
