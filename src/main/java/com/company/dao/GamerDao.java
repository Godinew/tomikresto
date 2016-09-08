package com.company.dao;

import java.sql.SQLException;

import java.util.List;

import com.company.tables.Gamer;

public interface GamerDao {
	public void addGamer(Gamer gamer) throws SQLException;
	public Gamer getGamer(double id) throws SQLException;
	public List<Gamer> getGamers() throws SQLException;

}
