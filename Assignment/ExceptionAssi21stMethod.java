package com;
import java.util.Scanner;
 class MyException1 extends Exception  {
          public MyException1(String msg) {
        	  super(msg);
          }
 }
 public class ExceptionAssi21stMethod{
  
  public static long abc(int num1,int num2) throws MyException1
  {
	  if(num1==0 && num2==0)
	  {
		  throw new MyException1("nuum1 and num2 should not be 0");
	  }
	  else if(num1<0 || num2<0)
	  {
		  throw new MyException1("num1 or num2 should not be negative");
	  }
	  else
	  {
	System.out.println("Power="+(long)Math.pow(num1,num2));
  // (long)Math.pow(num1,num2);
     }
	return num2;
  }
  
   public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc=new Scanner(System.in);
	  int num1,num2;
	  System.out.println("Enter the num1");
	  num1=sc.nextInt();
	  System.out.println("Enter the num2");
	  num2=sc.nextInt();
	  try {
		abc(num1, num2);
	} catch (MyException1 e) {
		// TODO Auto-generated catch block
		System.out.println(e);
}
	  
	}
}
 
