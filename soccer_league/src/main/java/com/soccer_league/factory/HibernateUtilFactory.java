package com.soccer_league.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.soccer_league.model.League;

public class HibernateUtilFactory {
private static SessionFactory factory;
	
	public static SessionFactory getSessionFactory()
	{
		factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(League.class).buildSessionFactory();
		return factory;
	}
}
