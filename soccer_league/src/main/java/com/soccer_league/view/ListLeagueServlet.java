package com.soccer_league.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.soccer_league.dao.LeagueDao;
import com.soccer_league.dao.LeagueDaoImpl;
import com.soccer_league.model.League;
import com.soccer_league.model.SharedLeague;

/**
 * Servlet implementation class ListLeagueServlet
 */
public class ListLeagueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<League> list=null;
	   
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			processRequest(request, response);
		}

		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			processRequest(request, response);
		}
		
		protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			

			try {
				
				LeagueDao sao = new LeagueDaoImpl();
				List<SharedLeague> users = sao.getLeague();
				
				out.println("<html><title>List All Available League</title><body>");
				out.println("<table class=\"table\" border='1'><tr><td>Season</td><td>Title</td><td>Year</td><td>Delete</td></tr>");
				
				
				for(SharedLeague it: users) {
					out.println("<tr><td>"+it.getSeason()+"</td><td>"+it.getTitle()+"</td><td>"+it.getYear()+"</td>"+"<td><a href=\"#\">Delete</a></td>"+"</tr>");
					
					
				}
				out.println("</table>");

				out.println("</body></html>");
				
			}
			
			finally {
		
				
			}
			
			
			/*
			
			list=new ArrayList<League>();
			list.add(new League("Autumn",2019,"Women's Cricket"));
			list.add(new League("Summer", 2019, "Beach Volley"));
			list.add(new League("Winter", 2019, "Basket Ball"));
			out.println("<html><title>List All Available League</title><body><table border='1'><tr><td>Season</td><td>Title</td><td>Year</td></tr>");
			
			for(League l:list)
			{
				out.println("<tr><td>"+l.getSeason()+"</td><td>"+l.getTitle()+"</td><td>"+l.getYear()+"</td></tr>");
			}
			out.println("</table><a href='index.html'>Go To Home Page</a></body></html>");
			
			*/
			
		}
		
		
}