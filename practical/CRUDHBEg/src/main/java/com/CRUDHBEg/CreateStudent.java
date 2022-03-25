package com.CRUDHBEg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.CRUDHBEg.HibernateUtil;

public class CreateStudent {

	public static void main(String[] args) {
	Student student = new Student();
	student.setStudentName("ravi");
	student.setEmail("ravi@gmail.com");
	student.setCourse("Dotnet");
	student.setPhone(9000299);
	student.setFees(500.55);
	
	// create session factory object
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	//getting sesion object from session factory
	Session session = sessionFactory.openSession();
	
	//getting transaction object from session object
	session.beginTransaction();
	
	session.save(student);
	System.out.println("record inserted");
	session.getTransaction().commit();
	session.close();
	sessionFactory.close();
	}
}
