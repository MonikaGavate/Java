package com.OneToMany;

import java.util.ArrayList;

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
    
    Question q=new Question();
    q.setQname("what is HTML");//Question 1
    
    Question q1=new Question();
    q1.setQname("what is Java");//Question 2
    
    Answer a=new Answer();
    a.setStudentname("Monika");
    a.setAnswers("It is hyper text markup language");//ans1 for que1
    
    Answer a1=new Answer();
    a1.setStudentname("Anuja");
    a1.setAnswers("It is structure of website");//ans2 for que1
    
    Answer a2=new Answer();
    a2.setStudentname("Akash");
    a2.setAnswers("It is used for web designing");//ans3 for que1
    
    Answer a3=new Answer();
    a3.setStudentname("nikita");
    a3.setAnswers("it is programming language for web application");//ans1 for que2
    
    Answer a4=new Answer();
    a4.setStudentname("Monika");
    a4.setAnswers("It is used for web,console & mobile application");//ans2 for que2
    
    ArrayList<Answer> arr1=new ArrayList<Answer>();
    arr1.add(a);
    arr1.add(a1);
    arr1.add(a2);
    
    ArrayList<Answer> arr2=new ArrayList<Answer>();
    arr2.add(a3);
    arr2.add(a4);
    
    q.setAnswers(arr1);
    q1.setAnswers(arr2);

    ses.save(q);
    ses.save(q1);
    
    t.commit();
    
    ses.close();
    System.out.println("added successfully");

    
    }
}
