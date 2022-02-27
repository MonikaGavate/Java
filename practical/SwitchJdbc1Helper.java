package com.JdbcMaven;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SwitchJdbc1Helper{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int id,ch,sage;
			String sname;
			 Scanner sc=new Scanner(System.in);
			 Connection con=Helper.makeCon();
			Statement st=con.createStatement();
			
       //     Scanner sc=new Scanner(System.in);
			do {
			
			System.out.println("1:insert\n2:update\n3:delete\n4:select\n5:exit");
			System.out.println("enter your choice:");
			  ch=Integer.parseInt(sc.nextLine());
		
			switch(ch) {
			
			case 1:
				System.out.println("how many record you want?");
				int n=Integer.parseInt(sc.nextLine());
				for(int i=0;i<n;i++)
				{
					System.out.println("enter id");
		    		 id=Integer.parseInt(sc.nextLine());
		    		System.out.println("enter name");
		    		 sname=sc.nextLine();
		    		System.out.println("enter age");
		    		sage=Integer.parseInt(sc.nextLine());
		    		st.executeUpdate("insert into student values("+id+",'"+sname+"',"+sage+")");
				}
	    
    	System.out.println("inserted succesfully into table");
         break;
			case 2:
				System.out.println("enter id");
			 id=Integer.parseInt(sc.nextLine());
			 System.out.println("enter name");
	    		sname=sc.nextLine();
         st.executeUpdate("update student set sname='"+sname+"' where id=" +id);
 		System.out.println("Updated successfully ");
			break;
			case 3:
				System.out.println("enter id");
				id=Integer.parseInt(sc.nextLine());
				st.executeUpdate("delete from student where id="+id);
		    	System.out.println("delete succesfully into table");
		    	break;
			case 4:
				ResultSet rs=st.executeQuery("select * from student");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			
			}
			break;
		
			case 5:
				System.exit(0);
			}
	
			}while(ch!=5);
		//			con.close();
			}
			
		catch(Exception e) {
    		System.out.println(e);
    	}
	}

}

