package monika;

import java.util.Scanner;

public class ArrayMultiDimAssi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int i,j,n,row,col;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter how many rows:");
     row=sc.nextInt();
     System.out.println("Enter how many cols:");
     col=sc.nextInt();
     int a[][]=new int[row][col]; 
     System.out.println("Enter the "+row*col+" elements:");
     for(i=0;i<row;i++)
     {
    	 for(j=0;j<col;j++)
    	 {
    		 a[i][j]=sc.nextInt();
    	 }
     }
     System.out.println("Elements are:");
     for(i=0;i<row;i++)
     {
    	 for(j=0;j<col;j++)
    		 {
    		   System.out.print(a[i][j]+" "); 
    		 }
    	 System.out.println();
     }
	}

}
