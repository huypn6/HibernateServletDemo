package com.demo.dao;

import org.hibernate.SessionFactory;

import com.demo.utils.HibernateUtils;

public class StudentDAO {
	
	static final SessionFactory factory = HibernateUtils.buildSessionFactory();
	
}
