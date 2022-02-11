package com.simplilearn.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Servlet implementation class ListData
 */
@WebServlet("/list")
public class ListData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session session= factory.openSession();
		
		List<Product> list= session.createQuery("from Product").list();
		
		PrintWriter out=response.getWriter();
		out.print("<h1>product List</h1><hr>");
		for(Product p:list)
		{
			out.print(p.getId()+" "+p.getName()+p.getPrice()+"<br>");
			out.print("Product Parts<br>");
			
			ProductParts part= p.getParts();
			out.print("HDD: "+part.getHdd()+"<br>");
			out.print("CPU: "+part.getCpu()+"<br>");
			out.print("RAM: "+part.getRam()+"<br>");
			out.print("----------------------------------<br>");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
