package com.demo.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	
	public static SessionFactory buildSessionFactory() {
		try {
			
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			configuration.addResource("Class.hbm.xml");
			configuration.addResource("Student.hbm.xml");
			
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			System.out.println("Load sessionFactory done");
			return sessionFactory;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
		
	}
}
