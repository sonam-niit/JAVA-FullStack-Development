package com.simplilearn.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoJDBC
 */
@WebServlet("/jdbc")
public class DemoJDBC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoJDBC() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		try {
			InputStream in= getServletContext().getResourceAsStream
					("/WEB-INF/application.properties");
			Properties props= new Properties();
			props.load(in);
			
			DatabaseConfig obj=new DatabaseConfig(props.getProperty("driver"),
					props.getProperty("url"), props.getProperty("username"),
					props.getProperty("password"));
			Connection conn=obj.getConnection();
			if(conn!=null)
			{	
				out.print("connection estblished");
					String sql="insert into student (id,fname,lname,email) values "+
				"(3,'Anurag','mishra','anurag@gmail.com')";
					Statement stmt= conn.createStatement();
					stmt.execute(sql);
					
					System.out.println("Data Inserted Successfully");
			}
				else
					System.out.println("Error while connecting with database");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
