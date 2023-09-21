package com.gqt.p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;


public class HibernateManager {
	private Session session;

	public HibernateManager() {
		// TODO Auto-generated constructor stub
		Configuration configuration = 
				new Configuration().configure("Hibernate.cfg.xml"); //connects to cfg
		ServiceRegistryBuilder builder = 
				new ServiceRegistryBuilder().applySettings
				(configuration.getProperties());
		SessionFactory sessionFactory = 
				configuration.buildSessionFactory
				(builder.buildServiceRegistry());       		   
		session =sessionFactory.openSession();	
		System.out.println("Connected to DB....");
	}
	void insertData(Student s) {
		Transaction transaction= session.beginTransaction();
		session.save(s);
		System.out.println("DATA IS SAVED");
		transaction.commit();


	}
}
