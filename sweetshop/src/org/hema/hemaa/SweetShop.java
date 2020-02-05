package org.hema.hemaa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SweetShop extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
	
		String area=req.getParameter("area");
		String shopName=req.getParameter("shop");
		String noOfItems=req.getParameter("items");
		String type=req.getParameter("type");
		
		//ServletOutputStream outputStream = resp.getOutputStream();
		//outputStream.print("Welcome" + area);
		
		//ServletOutputStream outputStream = resp.getOutputStream();
		 //outputStream.print("Thank you for visiting" + stallName);
				
		PrintWriter printWriter=resp.getWriter();
		printWriter.print("Thank you for visiting"  +shopName);
		// TODO Auto-generated method stub
		
		
	}

}
