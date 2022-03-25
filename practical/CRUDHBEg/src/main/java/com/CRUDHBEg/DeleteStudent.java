package com.CRUDHBEg;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

public class DeleteStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create seesion factory object
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		
		//getting transaction object from session factory
		Session session=sessionFactory.openSession();
		
		//getting transaction object from session object
		session.beginTransaction();
		
		Student student=session.load(Student.class,2);
	    session.delete(student);
	    System.out.println("record deleted");
	    session.getTransaction().commit();
	    sessionFactory.close();
	}

}
