package com.simplilearn.cookiedemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dashboard")
public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		Cookie cookie=null;
		Cookie cookies[]= request.getCookies();
		boolean found=false;
		if(cookies!= null)
		{
			for(int i=0;i<cookies.length;i++)
			{
				cookie=cookies[i];
				if(cookie.getName().contentEquals("userId") && cookie.getValue()!=null)
				{
					out.println("User Id read from cookie "+cookie.getValue()+"<br>");
					found=true;
				}
				if(cookie.getName().contentEquals("pass") && cookie.getValue()!=null)
				{
					out.println("Password read from cookie "+cookie.getValue()+"<br>");
					found=true;
				}
			}
		}
		if(!found)
			out.print("No user found in cookie");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
