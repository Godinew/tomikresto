

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.general.GameEngine;
import com.company.general.GamesList;

public class AcceptGameServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws IOException 
	    {
			String name1 = req.getParameter("username1");
			String name2 = req.getParameter("username2");
			
			GameEngine g = GamesList.getInstance().getForName(name1);
			g.addPlayer(name2);
			PrintWriter pw = resp.getWriter();
			pw.println(GamesList.getInstance());
			             System.out.println(pw.toString());
			
			
			resp.sendRedirect("game.jsp?username="+name2);
		
	    }
}
