package monika;

import java.util.Arrays;

public class ExamSortNumericAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {5,10,1,4,3,8,2,0,8};
     Arrays.sort(a);
     System.out.print("Sort the Numeric Element ascending order:");
     for(int i=0;i<a.length;i++)
     {
    	 System.out.print(a[i]+" ");
     }
     System.out.println();
     String array[]= {"Monika","Sakshi","Anuja","Trupti","Sarika"};
     Arrays.sort(array);
     System.out.print("Sort the String Element ascending order:");
     for(int i=0;i<array.length;i++)
     {
    	 System.out.print(array[i]+" ");
     }
}
}