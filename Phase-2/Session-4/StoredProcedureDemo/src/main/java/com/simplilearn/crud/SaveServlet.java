package com.simplilearn.crud;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.CallableStatement;
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
@WebServlet("/save")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Properties props=new Properties();
		
		String name=request.getParameter("pname");
		String price=request.getParameter("price");
		props.load(getServletContext().getResourceAsStream("/WEB-INF/application.properties"));
		try {
			DatabaseConfig config=new DatabaseConfig(props.getProperty("driver"),
					props.getProperty("url"), props.getProperty("username"), props.getProperty("password"));
			
			Connection conn= config.getConnection();
			
			CallableStatement stmt= conn.prepareCall("{call add_product(?,?)}");
			stmt.setString(1, name);
			stmt.setBigDecimal(2, new BigDecimal(price));
			
			int x=stmt.executeUpdate();
			if(x>0) {
				System.out.println("Data Instered");
				response.sendRedirect("list");
			}
			else {
				System.out.println("Error while insereting the data");
				response.sendRedirect("index.html");
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
//			e.printStackTrace(out);
//			System.out.println(e.getSQLState());
		}
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
