package com.avk.annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectStudent {
	public static void main(String[] args) {
		SessionFactory factory = 
			new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction(); 
		
		Student stu = (Student) session.load(Student.class, 1001);
		
		System.out.println(stu.getRegdno());
		System.out.println(stu.getSname());
		System.out.println(stu.getCgpa());
		
		tx.commit();
		System.out.println("Selection is successful");
		session.close();
		factory.close();
		
		
	}

}
