package com.OneToOne;

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
          e.setName("akash");
          
          Employee e1=new Employee();
          e1.setName("aavani");
          
          Address a=new Address();
          a.setHouseno("A-101");
          a.setCity("pune");
          a.setState("MH");
          a.setCountry("India");
          a.setPincode(412201);
          
          Address a1=new Address();
          a1.setHouseno("WS-101");
          a1.setCity("kolkata");
          a1.setState("WB");
          a1.setCountry("India");
          a1.setPincode(512201);
          
          e.setAddress(a);
          e1.setAddress(a1);
          
          a.setEmployee(e);
          a1.setEmployee(e1);
          
          ses.save(e);
          ses.save(e1);
          
          t.commit();
          ses.close();
          
          System.out.println("Added Successfully");
          
    }
}
