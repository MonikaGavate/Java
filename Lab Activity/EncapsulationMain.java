package monika;

import java.util.Scanner;

public class EncapsulationMain {
static void details(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the bank name");
	String Bankname=sc.next();
	System.out.println("Enter the Account holder name ");
	String Acc_holder_name=sc.next();
	System.out.println("Enter the account number");
	int accno=sc.nextInt();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
EncapsulationAssi a=new EncapsulationAssi();
details();
a.calc();
	}

}
