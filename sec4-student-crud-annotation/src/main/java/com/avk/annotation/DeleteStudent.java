package com.avk.annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteStudent {
	public static void main(String[] args) {
		SessionFactory factory = 
			new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction(); 
		
		Student stu = (Student) session.load(Student.class, 1);
		
		session.delete(stu);
		
		tx.commit();
		System.out.println("Deletion is successful");
		session.close();
		factory.close();
		
		
	}
}
