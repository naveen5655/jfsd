package com.avk.annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertStudent {
	
	public static void main(String[] args) {
		SessionFactory factory = 
			new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction(); 
		
		Student stu = new Student("Naveen", 10);
		
		session.save(stu);
		
		
		tx.commit();
		System.out.println("Insertion is successful");
		session.close();
		factory.close();
		
		
	}

}
