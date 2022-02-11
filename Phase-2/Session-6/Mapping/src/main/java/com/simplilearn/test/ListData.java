package com.simplilearn.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.simplilearn.ecommerce.Color;
import com.simplilearn.ecommerce.Finance;
import com.simplilearn.ecommerce.OS;
import com.simplilearn.ecommerce.Product;
import com.simplilearn.ecommerce.ScreenSizes;

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
			out.print(p.getId()+" "+p.getName()+p.getDateAdded()+p.getPrice()+"<br>");
			out.print("colors<br>");
			List<Color> colors=p.getColors();
			for(Color c:colors)
				out.print("Color Id: "+c.getColorId()+" Name: "+c.getName()+"<br>");
			
			Collection<ScreenSizes> screens=p.getScreenSizes();
			out.print("Screensizes<br>");
			for(ScreenSizes s:screens)
				out.print("Size: "+s.getSize()+"<br>");
			
			out.print("OS<br>");
			Set<OS> os=p.getOs();
			for(OS o:os)
				out.print("OS Id: "+o.getOsId()+" Name: "+o.getName()+"<br>");
			out.print("Check Finance<br>");
			Map map=p.getFinance();
			if(map.get("CREDITCART")!=null)
			{
				Finance f= (Finance)map.get("CREDITCARD");
				out.print("Name: "+f.getName());
			}
			if(map.get("BANK")!=null)
			{
				Finance f= (Finance)map.get("BANK");
				out.print("Name: "+f.getName()+"<br><br>");
			}
			
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
