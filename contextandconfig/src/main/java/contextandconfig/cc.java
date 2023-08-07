package contextandconfig;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cc")
public class cc extends HttpServlet {
	
	public void serivce(HttpServletRequest req,HttpServletResponse res) throws IOException {
		{
			PrintWriter out=res.getWriter();
			int x=Integer.parseInt(req.getParameter("num1"));
			int y=Integer.parseInt(req.getParameter("num2"));
			int k=x+y;
			out.println(k);
			// naku git raadu dinesh gaadu cheppadu bokkalagaaa
			//session
//			
//			ServletConfig conf=getServletConfig();
//			String str1=conf.getInitParameter("hi");
//			out.println("config name "+str1);
//			
//			ServletContext con=getServletContext();
//			String str=con.getInitParameter("dname");
//			out.println("context name "+str);
			
			
			

	}
		
	}

}
