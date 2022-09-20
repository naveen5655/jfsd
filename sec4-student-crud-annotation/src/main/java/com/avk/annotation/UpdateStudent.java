package com.avk.annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateStudent {
	public static void main(String[] args) {
		SessionFactory factory = 
			new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction(); 
		
		Student stu = (Student) session.load(Student.class, 1);
	
		stu.setCgpa(9);
		session.saveOrUpdate(stu);
		
		tx.commit();
		System.out.println("Updation is successful");
		session.close();
		factory.close();
		
		
	}
}
