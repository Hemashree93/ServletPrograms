package org.hema.hemaa;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cp")

public class ClothServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		Product cloth=new Product();
		cloth.id=6757;
		cloth.name="cotton";
		cloth.brand="Rymond";
		cloth.price=800;
		
		ServletContext context=getServletContext();
		
		String val1=context.getInitParameter("key1");
		String val2=context.getInitParameter("key2");
		
		
		ServletOutputStream servletOutputStream = resp.getOutputStream();
		servletOutputStream.print("<html><body bgcolor='cyan'>"
				+ "<h1>'" + val1 +"' '"+ val2 +"' </h1>+"
						+ "<h2>Thank you for selecting Cloth ''" + cloth.name +" " + cloth.brand + " "+ cloth.price+ "'' </h2>"
						+ "<a href=\'context.html\'>Back</a>"
						+ "</body></html>");
		
		
		
		
	}
	
	

}
