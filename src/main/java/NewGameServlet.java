

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.general.GameEngine;
import com.company.general.GamesList;
import javax.servlet.http.HttpSession;

public class NewGameServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws IOException 
	    {
			final String name = req.getParameter("username");
                    
			GamesList.getInstance().add(new GameEngine(name));
                        
			resp.sendRedirect("game.jsp?username="+name);
		
	    }
}