package com.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
 ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
 Employee s=(Employee)ac.getBean("e1");
 s.show();
}
}