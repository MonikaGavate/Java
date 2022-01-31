package monika;

import java.util.Scanner;

public class AssiSumProDiffQuo {
public void operation()
{
	Scanner sc=new Scanner(System.in);
	int n1,n2;
	System.out.println("enter 1st no");
	n1=sc.nextInt();
	System.out.println("enter 2nd no");
	n2=sc.nextInt();
	System.out.println("The sum of 2 no="+(n1+n2));
	System.out.println("The product of 2 no="+n1*n2);
	//int res=n1-n2;
	System.out.println("The difference of 2 no="+(n1-n2));
	System.out.println("The quotiont/division of 2 no="+n1/n2);
}
}
class CalcOperation{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssiSumProDiffQuo as=new AssiSumProDiffQuo();
		as.operation();
	}

}

****o/p****
enter 1st no
10
enter 2nd no
5
The sum of 2 no=15
The product of 2 no=50
The difference of 2 no=5
The quotiont/division of 2 no=2
