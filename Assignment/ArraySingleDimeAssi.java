package monika;

import java.util.Scanner;
public class ArraySingleDimeAssi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i,n;
     System.out.println("Enter the no of elements in array:");
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("Enter the elements:");
     for(i=0;i<n;i++)
     {
    	 a[i]=sc.nextInt();
     }
     System.out.print("Array Elements are:");
     for(i=0;i<n;i++)
     {
    	 System.out.print(a[i]+" ");
     }
	}

}
