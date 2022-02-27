package com.JdbcMaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			//load driver class for mysql db
			Class.forName("com.mysql.cj.jdbc.Driver");//old driver com.mysql.jdbc.Driver
		
			// connection url for mysql
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/core","root","post@");
			
			//execute query with db
			Statement st=con.createStatement();
			
			//executeQuery-used to execute select query
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
