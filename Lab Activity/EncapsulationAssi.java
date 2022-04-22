package monika;

import java.util.Scanner;

class EncapsulationAssi {
public String Bankname,Ac_holder_name;
private String accno;
private int Balance=50000;
int ch;
char ans;
Scanner sc=new Scanner(System.in);
public String getBankname() {
	return Bankname;
}
public void setBankname(String bankname) {
	Bankname = bankname;
}
public String getAc_holder_name() {
	return Ac_holder_name;
}
public void setAc_holder_name(String ac_holder_name) {
	Ac_holder_name = ac_holder_name;
}
public String getAccno() {
	return accno;
}
public void setAccno(String accno) {
	this.accno = accno;
}
public int getBalance() {
	return Balance;
}
public void setBalance(int balance) {
	Balance = balance;
}
void calc() {
	System.out.println("your initial amount is "+Balance);
	do {
		
	System.out.println("Enter the choice :\n1:deposit\n2:withdraw");
ch=sc.nextInt();


switch(ch) {
case 1:
	System.out.println("enter the deposit amount");
     int deposit = sc.nextInt();
     Balance+=deposit;
     break;
case 2:
	System.out.println("enter withdraw amount");
	int withdraw=sc.nextInt();
   Balance-=withdraw;	
   break;
default:
	System.out.println("invalid choice");
}
//System.out.println("balance="+Balance);
System.out.println("Do you want to continue");
ans=sc.next().charAt(0);
}while(ans=='Y'||ans=='y');

System.out.println("Total balance is="+Balance);
}

}