package com.avk;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;



public class InsertEmp {
	 private static SessionFactory factory;
	 static Transaction tx;
	 static Session session;
     
     Integer employeeID = null;
	public static void main(String[] args) {
		  
	      try {
	         factory = new AnnotationConfiguration().
	                   configure().
	                   addAnnotatedClass(Employee.class).
	                   buildSessionFactory();
	         session = factory.openSession();
	         
	         tx = session.beginTransaction();
	         Employee employee = new Employee("Naveen", "Badisa", 25000);
	        int  employeeID = (Integer) session.save(employee); 
	            tx.commit();
	         } catch (HibernateException e) {
	            if (tx!=null) tx.rollback();
	            e.printStackTrace(); 
	         } finally {
	            session.close(); 
	         }
	         
	     
	}
}
