package com.ManyToOneBidirectional;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

public class App 
{
	@SuppressWarnings("unchecked")
	 public static void main(String[] args) {
	 
		Student student1 = new Student("sam", "joshi", "Maths");
	    Student student2 = new Student("Joshua", "Brill", "Science");
	    Student student3 = new Student("Peter", "Pan", "Physics");
	 
	    University university = new University("SPPU", "INDIA");
	    List<Student> allStudents = new ArrayList<Student>();
	 
	    student1.setUniversity(university);
	    student2.setUniversity(university);
	    student3.setUniversity(university);
	 
	    allStudents.add(student1);
	    allStudents.add(student2);
	    allStudents.add(student3);
	
	    university.setStudents(allStudents);
	 
	    Session session = HibernateUtil.getSessionFactory().openSession();
	    session.beginTransaction();
	    session.persist(university);// Students will be presisted automatically, thanks to CASCADE.ALL defined on
//	students
	
	    // property of University class.
	 List<Student> students = (List<Student>) session.createQuery(
	 "from Student ").list();
	 for (Student s : students) {
	 System.out.println("Student Details : " + s);
	 System.out.println("Student University Details: "
	 + s.getUniversity());
	 }
	
	 // Note that now you can also access the relationship from University to Student
	 session.getTransaction().commit();
	 session.close();
	 }
	}
