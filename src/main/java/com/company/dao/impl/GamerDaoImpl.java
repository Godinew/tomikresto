package com.company.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;

import com.company.dao.GamerDao;
import com.company.tables.Gamer;
import com.company.util.HibernateUtil;

public class GamerDaoImpl implements GamerDao {


	@Override
	public void addGamer(Gamer gamer) throws SQLException {
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(gamer);
			session.getTransaction().commit();
			
		}catch(Exception e) {e.printStackTrace();}
		finally{
			if((session!=null)&&(session.isOpen())) session.close();}
		
		
	}

	@Override
	public Gamer getGamer(double id) throws SQLException {
		Gamer result = null;
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			result = (Gamer) session.get(Gamer.class, id);
		}catch(Exception e) {e.printStackTrace();}
		finally{
			if((session!=null)&&(session.isOpen())) session.close();}
		
		return result;
	}
	

	@Override
	public List<Gamer> getGamers() throws SQLException {
		List<Gamer> result = null;
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().openSession();
			result = session.createCriteria(Gamer.class).list();
		}catch(Exception e) {e.printStackTrace();}
		finally{
			if((session!=null)&&(session.isOpen())) session.close();}
		return result;
	}

}
