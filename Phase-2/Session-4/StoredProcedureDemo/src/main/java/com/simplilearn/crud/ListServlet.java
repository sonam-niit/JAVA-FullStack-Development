package com.simplilearn.crud;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Properties props=new Properties();
		props.load(getServletContext().getResourceAsStream("/WEB-INF/application.properties"));
		try {
			DatabaseConfig config=new DatabaseConfig(props.getProperty("driver"),
					props.getProperty("url"), props.getProperty("username"), props.getProperty("password"));
			
			Connection conn= config.getConnection();
			
			Statement stmt= conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet result =stmt.executeQuery("select * from eproduct");
			out.print("<h1>Product List</h1><hr>");
			while(result.next())
			{
				int id=result.getInt(1);
				out.print (id+" "+result.getString(2)+" " + result.getBigDecimal(3).toString()+
						" "+result.getTimestamp(4).toString() +"<br><br>");
				
			}
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
