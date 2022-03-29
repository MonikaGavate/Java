package com.Entity;

import java.util.Iterator;
import java.util.List;

public class question {

	private int qno;
	private String qname;
	private List<String> answers;
	
	
	public question(int qno, String qname, List<String> answers) {
		super();
		this.qno = qno;
		this.qname = qname;
		this.answers = answers;
	}
	
	public void show() {
		System.out.println(qno + " " +qname);
	  System.out.println("----------Answer--------");
	  Iterator<String> itr=answers.iterator();
	  while(itr.hasNext()) {
		  System.out.println(itr.next());
	  }
	}
}
