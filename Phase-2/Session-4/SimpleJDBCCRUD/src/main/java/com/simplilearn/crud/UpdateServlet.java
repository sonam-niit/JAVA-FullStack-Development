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
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Properties props=new Properties();
		String id=request.getParameter("id");
		String name=request.getParameter("pname");
		String price=request.getParameter("pprice");
		props.load(getServletContext().getResourceAsStream("/WEB-INF/application.properties"));
		try {
			DatabaseConfig config=new DatabaseConfig(props.getProperty("driver"),
					props.getProperty("url"), props.getProperty("username"), props.getProperty("password"));
			
			Connection conn= config.getConnection();
			
			PreparedStatement stmt= conn.prepareStatement("update eproduct set name=? , price=? where id=?");
			stmt.setString(1, name);
			stmt.setBigDecimal(2, new BigDecimal(price));
			stmt.setInt(3, Integer.parseInt(id));
			
			int x=stmt.executeUpdate();
			if(x>0)
				System.out.println("Data Updated Successfully");
			else
				System.out.println("Error while updating a data");
			
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
