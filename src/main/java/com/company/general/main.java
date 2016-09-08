package com.company.general;

import java.sql.SQLException;

import com.company.dao.GamerDao;
import com.company.tables.Gamer;
import java.util.List;

public class main {

	public static void main(String[] args) throws SQLException {
		Factory factory = Factory.getInstance();
		GamerDao gamerDao = factory.GetGamerDao();
		
		gamerDao.addGamer(new Gamer("435354", "password"));
               System.out.println(gamerDao.getGamers());
             List<Gamer> f=gamerDao.getGamers();
            for (Gamer r:gamerDao.getGamers()){
                System.out.println(r.getId()+"||||"+r.getLogin()+"||||"+r.getPassword());
            }
	}

}
