package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Entity.question;

public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");

      question q=(question)ac.getBean("q1");
      q.show();
    }
}
