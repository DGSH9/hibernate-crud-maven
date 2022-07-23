package com.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.hib.to.Player;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		try {
			Configuration configuration = new Configuration().configure();
			configuration.addAnnotatedClass(com.hib.to.Player.class);
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties());

			SessionFactory factory = configuration.buildSessionFactory(builder.build());

			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			
			//Create data in database
//			Player p1 = new Player(26, "Neeraj", "India", 24);
//			Player p2 = new Player(27, "Neeraj1", "India", 24);			
//			session.save(p1);
//			session.save(p2);
			
			//Read data from database
//			Player player = session.get(Player.class, 24);
//			System.out.println(player);
			
			//Update data of Database
//			Player player = session.get(Player.class, 24);
//			player.setPlayerName("Bhanu");
//			player.setTeamName("Kerla");
//			player.setAge(29);
			
			//Delete data from databases
//			Player player = session.get(Player.class, 25);
//			session.delete(player);
			
			transaction.commit();
			session.close();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}
}
