package com.company.general;

import com.company.dao.GamerDao;
import com.company.dao.impl.GamerDaoImpl;

public class Factory {
	public static Factory instance;
	private Factory(){};
	public GamerDao gamerDao;
	public static synchronized Factory getInstance(){
		if(instance == null){instance = new Factory();}
		return instance;
	};
	
	public GamerDao GetGamerDao(){
		if(gamerDao==null) gamerDao=new GamerDaoImpl();
		return gamerDao;
		
	};
	
	

}
