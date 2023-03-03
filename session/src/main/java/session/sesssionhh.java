package session;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/dinesh")
public class sesssionhh extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;
		
		// Session
		HttpSession s1 = req.getSession();
		s1.setAttribute("base", k);
		
//		RequestDispatcher rd = req.getRequestDispatcher("Calling");
//		rd.forward(req, res);
		//res.sendRedirect("Calling");
	}

}
