

import com.company.dao.GamerDao;
import com.company.general.Factory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.general.GameEngine;
import com.company.general.GamesList;
import com.company.tables.Gamer;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;

public class StartServlet extends HttpServlet {
   Factory factory =null;
   GamerDao gamerDao=null;
	/**
	 * 
	 */
    protected static String n1 = "";
       protected static String p1 = "";

    public static String getN1() {
        return n1;
    }

    public static void setN1(String n1) {
        StartServlet.n1 = n1;
    }

    public static String getP1() {
        return p1;
    }

    public static void setP1(String p1) {
        StartServlet.p1 = p1;
    }
        
     @Override
    public void init()
            throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
       factory = Factory.getInstance();
	 gamerDao = factory.GetGamerDao();
    }
  
       
	private static final long serialVersionUID = 1L;
	

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws IOException 
	    {
       try {
           final String name = req.getParameter("username");
           final String password= req.getParameter("password");
           
           
           n1 = req.getParameter("username");
           p1= req.getParameter("password");
           resp.setCharacterEncoding("UTF-8");
           resp.setContentType("text/html");
           
           gamerDao.addGamer(new Gamer( StartServlet.n1,StartServlet.p1));
           
           PrintWriter pw = resp.getWriter();
           pw.println("<html>");
           pw.println("<title>Game start</title>");
           pw.println("<body>");
           pw.println("<h1>Крестики нолики </h1>");
           pw.println("<h2> Игрок:" + name + " </h2>");
           pw.println("<form action=\"NewGameServlet\" method=\"Get\">");
           pw.println("<input type= \"hidden\" name=\"username\" value="+ name+" >");
           pw.println("<input type= \"hidden\" name=\"password\" value="+ password+" >");
           pw.println("<input type= \"submit\" value=\"Начать игру\"/>");
           pw.println("</form>");
           
           pw.println("<h2> выбор игры:</h2>");
           ArrayList<GameEngine> l = GamesList.getInstance().GetList();
           for(GameEngine g : l)
               pw.println("<p><a href=\"AcceptGameServlet?username1="+g.playerOne+"&username2="+name+"\"> с пользователем "+g.playerOne+"</a>");
           
           
           
           
           
           pw.println("</body>");
           pw.println("</html>");
       } catch (SQLException ex) {
           Logger.getLogger(StartServlet.class.getName()).log(Level.SEVERE, null, ex);
       }
	   }
	}


