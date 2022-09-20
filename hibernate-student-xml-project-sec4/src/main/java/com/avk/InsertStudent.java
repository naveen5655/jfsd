package com.avk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertStudent {

	public static void main(String[] args) {
	Student s = new Student();
	//s.setRegdno(1);
	s.setSname("naveen");
	s.setCgpa(10);
	
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	Transaction tx = session.beginTransaction();
	
	session.save(s);
	
	tx.commit();
	
	
	}

}
