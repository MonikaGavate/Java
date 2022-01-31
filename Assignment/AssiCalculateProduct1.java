package monika;

import java.util.Scanner;

public class AssiCalculateProduct1 {
public void calculate()
{
	Scanner sc=new Scanner(System.in);
	int n1,n2,n3;
	System.out.println("Enter the 1st no");
	n1=sc.nextInt();
	System.out.println("Enter the 2nd no");
	n2=sc.nextInt();
	System.out.println("Enter the 3rd no");
	n3=sc.nextInt();
	System.out.println("The product of three no is="+n1*n2*n3);
}
}
class CalcProduct{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      AssiCalculateProduct1 p=new AssiCalculateProduct1();
      p.calculate();
	}

}
