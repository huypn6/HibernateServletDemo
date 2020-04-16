package com.demo.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.demo.entities.Classes;
import com.demo.utils.HibernateUtils;

public class ClassDAO {

	static final SessionFactory factory = HibernateUtils.buildSessionFactory();

	public static void main(String[] args) {
		ClassDAO dao = new ClassDAO();
		List<Classes> list = dao.getAll();
		System.out.println(list.size());
	}

	public List<Classes> getAll() {
		try {
			Session session = factory.openSession();
			session.beginTransaction();

			Query q = session.createQuery("FROM Classes");
			List<Classes> list = q.list();
			session.getTransaction().commit();
			session.close();
			return list;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public Classes save(Classes newClass) {
		try {
			Session session = factory.openSession();
			session.beginTransaction();

			session.save(newClass);

			session.getTransaction().commit();
			session.close();
			return newClass;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

}
