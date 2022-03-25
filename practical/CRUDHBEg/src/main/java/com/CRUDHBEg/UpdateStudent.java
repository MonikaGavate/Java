package com.CRUDHBEg;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

public class UpdateStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create seesion factory object
				SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
				
				//getting transaction object from session factory
				Session session=sessionFactory.openSession();
				
				//getting transaction object from session object
				session.beginTransaction();
				
				Student student=session.get(Student.class,1);
	          student.setStudentName("Ravi");
	          System.out.println("record updated");
	          session.getTransaction().commit();
	          sessionFactory.close();          
	}

}
