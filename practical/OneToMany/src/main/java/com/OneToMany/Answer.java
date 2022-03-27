package com.OneToMany;

import javax.persistence.*;

@Table(name="answer")
@Entity
public class Answer {
    
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int id;
	private String studentname;
	private String answers;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getAnswers() {
		return answers;
	}
	public void setAnswers(String answers) {
		this.answers = answers;
	}
	
}
