package or.hema.hemaa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/foodstreet")
public class FoodStreet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		String area=req.getParameter("area");
		String stallName=req.getParameter("stallName");
		String noOfItems=req.getParameter("noOfItems");
		String type=req.getParameter("type");
		
		//ServletOutputStream outputStream = resp.getOutputStream();
		//outputStream.print("Welcome" + area);
		
		//ServletOutputStream outputStream = resp.getOutputStream();
		// outputStream.print("Thank you for visiting" + stallName);
				
		PrintWriter printWriter=resp.getWriter();
		printWriter.print("Thank you for visiting"  +stallName);
		// TODO Auto-generated method stub
		
	}

}
