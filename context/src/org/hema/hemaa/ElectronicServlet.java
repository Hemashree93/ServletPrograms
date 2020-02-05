package org.hema.hemaa;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ep")
public class ElectronicServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	Product pro=new Product();
	pro.id=23345;
	pro.name="EarPhone";
	pro.brand="sony";
	pro.price=340;
	
	
	ServletContext context=getServletContext();
	
	String val1=context.getInitParameter("key1");
	String val2=context.getInitParameter("key2");
	
	
	ServletOutputStream servletOutputStream = resp.getOutputStream();
	servletOutputStream.print("<html><body bgcolor='cyan'>"
			+ "<h1>'"+ val1 +"'  '"+ val2 +"' </h1>"
					+"<h2>Thank you for selecting electronic ' '" +pro.name +" " + pro.brand + " "+ pro.price + "'' </h2>"
					+ "<a href=\'context.html\'>Back</a>"
					+ "</body></html>");
	
	
	
		
	}

	
	


}
