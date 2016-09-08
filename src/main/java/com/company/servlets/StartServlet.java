package com.company.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.general.GameEngine;
import com.company.general.GamesList;

public class StartServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws IOException 
	    {
		   final String name = req.getParameter("username");
	       final String password= req.getParameter("password");
	       
	       
		
		
		    resp.setCharacterEncoding("UTF-8");
	        resp.setContentType("text/html");

	        PrintWriter pw = resp.getWriter();
	        pw.println("<html>");
	        pw.println("<title>Tick Tack Toe</title>");
	        	pw.println("<body>");
	        		pw.println("<h1>Game TickTackToe </h1>");
	        		pw.println("<h2> Welcome " + name + " </h2>");
	        		pw.println("<form action=\"/newGame\" method=\"Get\">");
	        		pw.println("<input type= \"hidden\" name=\"username\" value="+ name+" >");
	        		pw.println("<input type= \"submit\" value=\"Создать игру\"/>");
	        		pw.println("</form>");
	        		
	        		pw.println("<h2> Присоединиться к  игре...</h2>");
	        	    ArrayList<GameEngine> l = GamesList.getInstance().GetList();
	        	     for(GameEngine g : l)
	        	    	pw.println("<p><a href=\"/accept?username1="+g.playerOne+"&username2="+name+"\">Игра с игроком "+g.playerOne+"</a>");
	        	    
	        		
	        		
	        		  		
	        		
	        	pw.println("</body>");
	        pw.println("</html>");
	   }
	}


