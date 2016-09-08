package com.company.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.general.GameEngine;
import com.company.general.GamesList;

public class PlayGameServlet extends HttpServlet  {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws IOException, ServletException 
	    {
			String name = req.getParameter("username");
			
			String newGame = req.getParameter("new");
									
			GameEngine g = GamesList.getInstance().getForName(name);
			
			if(newGame!=null&&newGame.equals("yes")) 
				g.startNewGame(); 
				
			else{
				int index = Integer.valueOf(req.getParameter("index"));
			
					if((g.status.equals("Draw"))||(g.status.contains("Win")))
					{}
					else 
						if((name.equals(g.playerOne))&&(g.status.contains(g.playerOne))||((name.equals(g.playerTwo))&&((g.status.contains(g.playerTwo))||(g.status.contains("?")))))
							g.makeAMove(index, name);}
			
			
			
			resp.sendRedirect("game.jsp?username="+name);
		    
	    }

}
