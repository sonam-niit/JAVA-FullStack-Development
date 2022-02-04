package com.simplilearn.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Generic extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		
		String uname= req.getParameter("uname");
		String pass= req.getParameter("pass");
		
		if(pass.equals("admin123"))
		{ 
			out.print("Login done successfully");
			out.print("Welcome "+uname);
		}
		else
		{
			out.print("invalid Login");
		}
		
	}

}
