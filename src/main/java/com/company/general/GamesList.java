package com.company.general;

import java.util.ArrayList;
import java.util.List;

public class GamesList {// Синглтон

	public static GamesList instance;
	
	private GamesList(){};
	
	private static List<GameEngine> list = new ArrayList<GameEngine>();
	
	public static synchronized GamesList getInstance(){
		if(instance==null) instance = new GamesList();
		return instance;
	};
	
	public void add(GameEngine g)
	{list.add(g);}
	
	public GameEngine getForName(String name){
		for(GameEngine g: list) if(g.playerOne.equals(name)) return g; else
			if( g.playerTwo!=null) if(g.playerTwo.equals(name))return g; 
					
		return null;
		
	}
	
	public ArrayList<GameEngine> GetList(){
		return (ArrayList<GameEngine>)list;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for (GameEngine g: list) {sb.append(g.playerOne);
				 System.out.println(sb.toString());					sb.append((g.playerTwo==null)?"":g.playerTwo);}
		return sb.toString();
               
	};
	
	
	
	
}
