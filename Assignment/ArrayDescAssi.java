package monika;

import java.util.Scanner;

public class ArrayDescAssi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i,j,n,temp;
       System.out.println("Enter the no of elements in array:");
       Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements:");
        for(i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
      for(i=0;i<n;i++)
      {
    	  for(j=i+1;j<n;j++)
    	  {
    		  if(a[i]<a[j])
    		  {
    			  temp=a[i];
    			  a[i]=a[j];
    			  a[j]=temp;
    		  }
    	  }
      }
      System.out.print("Array Element in descending order:");
      for(i=0;i<n;i++)
      {
    	  System.out.print(a[i]+" ");
      }
	  }

}
