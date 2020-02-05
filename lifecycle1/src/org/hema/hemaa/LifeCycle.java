package org.hema.hemaa;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/*@WebServlet(urlPatterns = "/lifecycle1", loadOnStartup = 688,
initParams =
{
		@WebInitParam(name = "jingalala", value = "ulala"),
		@WebInitParam(name = "age", value = "56")
})*/
public class LifeCycle extends GenericServlet {
	

	@Override
	public void service(ServletRequest reg, ServletResponse resp) throws ServletException, IOException {
		System.out.println("initializing the resources of LifeCycleServlet");
		
		ServletConfig cong=getServletConfig();
		String value=cong.getInitParameter("name");
		String age=cong.getInitParameter("age");
		System.out.println("Service method is executed");
		
		String appName=reg.getParameter("appName");
		String appSize=reg.getParameter("appSize");
		String appVersion=reg.getParameter("appVersion");
		String type = reg.getParameter("type");
		
		ServletOutputStream outputStream=resp.getOutputStream();
		outputStream.print("Thank you for visiting " + appName + " " + value + " " + age);
	}
	public LifeCycle() {
		System.out.println("Servlet object is created");
	}
	
	@Override
	public void destroy() {
		System.out.println("Close only the Costly Resources");
	}
	
	
}
