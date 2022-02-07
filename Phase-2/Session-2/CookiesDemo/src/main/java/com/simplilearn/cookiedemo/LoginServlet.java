package com.simplilearn.cookiedemo;

import java.io.IOException;
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
		
		Cookie cookie= new Cookie("userId", name);
		Cookie cookie1= new Cookie("pass", pass);
		response.addCookie(cookie);
		response.addCookie(cookie1);
		
		//response.getWriter().print("<a href='dashboard'>Dashboard</a>");
		response.sendRedirect("dashboard");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
