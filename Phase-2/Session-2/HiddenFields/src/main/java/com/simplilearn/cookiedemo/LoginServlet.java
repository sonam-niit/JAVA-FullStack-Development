package com.simplilearn.cookiedemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name= request.getParameter("userid");
		String pass= request.getParameter("password");
		PrintWriter out=response.getWriter();
		if(pass.equals("admin123"))
		{
			out.print("<form action='dashboard'>");
			out.print("<input type='hidden' name='user' value='"+name+"'>");
			out.print("<input type='submit' value='dashboard'>");
			out.print("</form>");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
