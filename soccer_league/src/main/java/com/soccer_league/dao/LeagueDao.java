
package com.soccer_league.dao;

import java.util.List;

import org.hibernate.Session;

import com.soccer_league.model.League;
import com.soccer_league.model.SharedLeague;

public interface LeagueDao {
	public List<SharedLeague> getLeague();

	public void createLeague(League league);
	
	public void deleteEmployee(int id);

}
