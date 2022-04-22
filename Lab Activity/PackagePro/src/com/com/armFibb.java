package com.com;

import java.util.Scanner;

interface A{
void fibonacci();
}

interface B{
	void armstrong();
}


public class armFibb implements A,B {

	@Override
	public void fibonacci() {
	int x=0,y=1,z,n;
	System.out.println("Enter the how many terms in fibonacci series:");
	Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.print("Fibonacci series=");
		for(int i=0;i<n;i++) {
			z=x+y;
			System.out.print(y+" ");
			x=y;
			y=z;
		}
		System.out.println();
	}

   @Override
   public void armstrong() {
	int num,rem,num1,sum=0;
	System.out.println("Enter the number:");
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	num1=num;
	while(num>0) {
		rem=num%10;
	    sum=sum+(rem*rem*rem);
	    num=num/10;
	}
	if(sum==num1)
	{
		System.out.println(+num1+" no is armstrong");
	}
	else
	{
		System.out.println(+num1+" no is not armstrong");
	}
	
}

}
