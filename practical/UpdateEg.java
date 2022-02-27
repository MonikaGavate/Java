package com.JdbcMaven;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//old driver com.mysql.jdbc.Driver
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/core","root","post@");
			Statement st=con.createStatement();
			
			// updating record in db table
    		st.executeUpdate("update student set sname='Jay' where id=3 ");
    		System.out.println("Updated successfully ");
			
    		
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
