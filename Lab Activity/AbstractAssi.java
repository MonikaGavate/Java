package monika;

import java.util.Scanner;

abstract class AbstractAssi {
	abstract void sumOfDigitAndArmstrong();
	void average() {
	int n;
	double avg=0,Arraysum=0;
	Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array ");
n=sc.nextInt();
	int a[]=new int[n];
	
	System.out.println("enter the array element");
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}

	for(int i=0;i<n;i++) {
		//System.out.println(a[i]);
		Arraysum+=a[i];
		
	}
	avg=Arraysum/n;
	System.out.println("Average:"+avg);
	}
}
	class one extends AbstractAssi{

		@Override
		void sumOfDigitAndArmstrong() {
			int no,sum=0,digit;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number:");
			no=sc.nextInt();
			while(no>0) {
				digit=no%10;
				sum=sum+digit;
				no=no/10;
			}
			System.out.println("sum of digit="+sum);
			}
	}
			class two extends AbstractAssi{

				@Override
				void sumOfDigitAndArmstrong() {
					int num,num1,sum1=0,rem;
					Scanner sc=new Scanner(System.in);
					System.out.println("enter the no:");
					num=sc.nextInt();
					num1=num;
					while(num>0) {
						rem=num%10;
						sum1=sum1+(rem*rem*rem);
						num=num/10;
					}
					if(num1==sum1) {
						System.out.println("no is armstrong");
					}
					else
					{
						System.out.println("no is not armstrong");
					}
					
				}
				
			}
			
			
