package com.soccer_league.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.modelmapper.ModelMapper;

import com.soccer_league.factory.HibernateUtilFactory;
import com.soccer_league.model.League;
import com.soccer_league.model.SharedLeague;

public class LeagueDaoImpl implements LeagueDao {
	
	private Session session = null;
	private SessionFactory factory = null;

	{
		factory = HibernateUtilFactory.getSessionFactory();
	}

	public void createLeague(League league) {
		try {
			session = factory.openSession();
			session.getTransaction().begin();
			session.persist(league);
			session.getTransaction().commit();

		} finally {
			session.close();
		}
	}
	
	@Override
	public List<SharedLeague> getLeague() {
		// TODO Auto-generated method stub
		
		ModelMapper mapper = new ModelMapper();
		SharedLeague sl= new SharedLeague();
		League l = mapper.map(sl, League.class);

		session = factory.openSession();
		session.getTransaction().begin();
		
		Query query=session.createQuery("from League");
		session.getTransaction().commit();
		@SuppressWarnings("unchecked")
		List<League> list1=query.getResultList();
		List<SharedLeague> sList=new ArrayList<SharedLeague>();
		for(League e:list1)
		{
			SharedLeague se=mapper.map(e, SharedLeague.class);
			sList.add(se);
		}
		
		return sList;
	}
	
	
	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
		session= factory.openSession();
		session.getTransaction().begin();
		League e=session.get(League.class, id);
		if(e!=null)
		{
			session.delete(e);
			System.out.println("deleted sucessfully..");
			session.getTransaction().commit();
		}
		
		else
		{
			System.out.println("no such record found.");
		}
		
		
		
	}

}
