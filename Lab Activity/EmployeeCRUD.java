package com.JdbcMaven;

import java.io.BufferedReader;


import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class EmployeeCRUD {
	


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				int id,eage;
				double sal;
				String ename;
				Class.forName("com.mysql.cj.jdbc.Driver");//old driver com.mysql.jdbc.Driver
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/core","root","post@");
				Statement st=con.createStatement();
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				do {
				
				System.out.println("Enter your choice:\n1:select\n2:insert\n3:update\n4:delete");
				//System.out.println("enter your choice:");
				int ch=Integer.parseInt(br.readLine());
				switch(ch) {
				case 1:ResultSet rs=st.executeQuery("select * from employee");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getDouble(4));
				
				}
				break;
				case 2:
		      PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?)");
	    	//	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    		System.out.println("enter employee  id");
	    		 id=Integer.parseInt(br.readLine());
	    		System.out.println("enter employee name");
	    		 ename=br.readLine();
	    		System.out.println("enter age");
	    		eage=Integer.parseInt(br.readLine());
	    		System.out.println("enter employee sal");
	    		sal=Integer.parseInt(br.readLine());
	    		ps.setInt(1,id);
	    		ps.setString(2, ename);
	    		ps.setInt(3, eage);
	    		ps.setDouble(4, sal);
	    		ps.executeUpdate();
	    	System.out.println("inserted succesfully into table");
	         break;
				case 3:
					System.out.println("enter employee id");
				 id=Integer.parseInt(br.readLine());
				 System.out.println("enter employee name");
		    		ename=br.readLine();
	         st.executeUpdate("update employee set e_name='"+ename+"' where e_id=" +id);
	 		System.out.println("Updated successfully ");
				break;
				case 4:
					System.out.println("enter employee id");
					id=Integer.parseInt(br.readLine());
					st.executeUpdate("delete from employee where e_id="+id);
			    	System.out.println("delete succesfully into table");
			    	break;
			    	default:
			    		System.out.println("enter valid data");
				}
			System.out.println("DO you want to continue:y/n");
				String s=br.readLine();
				if(s.startsWith("n"))
				{
					break;
				}
				
				
				//con.close();
				}while(true);
			//			con.close();
				}
				
			catch(Exception e) {
	    		System.out.println(e);
	    	}
		}

	}

