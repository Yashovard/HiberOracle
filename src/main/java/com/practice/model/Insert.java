package com.practice.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert {

	public static void main(String[] args) {
		System.out.println("Hibernate Started........");

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee employee = new Employee();
		employee.setId(101);
		employee.setName("Yash");
		employee.setNumber(9669);
		employee.setAddress("Bistan");
		session.save(employee);
		transaction.commit();
		session.close();
		System.out.println("data inserted...");
	}

}
