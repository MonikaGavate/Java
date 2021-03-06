package com.ManyToOneUnidirectional;

import javax.persistence.*;

@Entity
@Table(name = "students1")
public class Student {
 
	@Id
    @GeneratedValue
    @Column(name = "STUDENT_ID")
    private long id;
 
	@Column(name = "FIRST_NAME")
    private String firstName;
 
	@Column(name = "LAST_NAME")
    private String lastName;
 
	@Column(name = "SECTION")
    private String section;
   @ManyToOne(optional = false)
   @JoinColumn(name="UNIVERSITY_ID")
   private University university;
public Student() {
	
}
public Student(String firstName, String lastName, String section) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.section = section;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getSection() {
	return section;
}
public void setSection(String section) {
	this.section = section;
}
public University getUniversity() {
	return university;
}
public void setUniversity(University university) {
	this.university = university;
}
@Override
public String toString() {
	return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", section=" + section + "]";
}


   

}
