package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Calling")
public class frnd extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException  {
		HttpSession s2 = req.getSession();
		int valu = (int)s2.getAttribute("base");
		
		int result = valu * valu;
		PrintWriter pw = res.getWriter();
		pw.println("Total Calculation is "+result);
	}
}