package com.ManyToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory s =new Configuration().configure().buildSessionFactory();
        Session ses=s.openSession();
        Transaction t=ses.beginTransaction();
     
  	Employee e=new Employee();
    e.setName("monika");
  	
	Employee e1=new Employee();
    e1.setName("anuja");
    
    Employee e2=new Employee();
    e2.setName("akash");
  	
  	
  	
    Company d=new Company();
    d.setCname("infosys");
    
    Company d1=new Company();
    d1.setCname("TCS");
    
    e.setCom(d);
    e1.setCom(d);
    e2.setCom(d1);
    
    ses.save(e);
    ses.save(e1);
    ses.save(e2);
    
    t.commit();
    
    ses.close();
    System.out.println("added successfully");

    

    }
}
