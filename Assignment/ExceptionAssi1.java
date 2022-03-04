package com;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionAssi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num1,num2;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the num1");
    num1=sc.nextInt();
     System.out.println("Enter the num2");
     num2=sc.nextInt();
		try {
			int result=num1/num2; 
			   System.out.println("result="+result);
 try{
   }
 catch(InputMismatchException i)
	{
System.out.println(i);
		}
   }
 catch(Exception e) {
	 System.out.println(e);
	}

	}
}
