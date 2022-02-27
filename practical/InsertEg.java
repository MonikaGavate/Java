package com.JdbcMaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class InsertEg 
{
    public static void main( String[] args )
    {
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");//old driver com.mysql.jdbc.Driver
    		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/core","root","post@");
    		Statement st=con.createStatement();
    		//inserting a record into db table
    		st.executeUpdate("insert into student values(7,'sakshi',41)");
    	System.out.println("inserted succesfully into table");
    		ResultSet rs=st.executeQuery("select * from student");
    		while(rs.next()) {
    			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
    		
    		}
    		con.close();
    		
    	}
    	catch(Exception e) {
    		System.out.println(e);
    	}
    }
}
