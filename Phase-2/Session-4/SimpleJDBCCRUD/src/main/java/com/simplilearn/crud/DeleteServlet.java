package com.simplilearn.crud;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveServlet
 */
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Properties props=new Properties();
		
		String id=request.getParameter("id");
		
		props.load(getServletContext().getResourceAsStream("/WEB-INF/application.properties"));
		try {
			DatabaseConfig config=new DatabaseConfig(props.getProperty("driver"),
					props.getProperty("url"), props.getProperty("username"), props.getProperty("password"));
			
			Connection conn= config.getConnection();
			
			PreparedStatement stmt= conn.prepareStatement("delete from eproduct where id=?");
			stmt.setInt(1, Integer.parseInt(id));
			
			int x=stmt.executeUpdate();
			if(x>0)
				System.out.println("Data deleted Successfully");
			else
				System.out.println("Error while deleting a data");
			
			response.sendRedirect("list");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
