
import java.util.Scanner;
public class BubbleSort
{
void inputArray(int array[],int length)
 {
     Scanner sc=new Scanner(System.in);
     System.out.print("Input "+length+" (integer) elements: ");
          for(length--;length>=0;length--){
        array[length]=sc.nextInt();
     }
 }
void printArray(int array[],int length)
 {
     System.out.print("The elements of the given array are: ");
     for(int i=0;i<length;i++)
    	 System.out.print(array[i]+" ");
 }
void bubbleSort(int array[], int length)
 {
     for(int i = 0; i < length-1; i++){
         
         for(int j=0;j<length-i-1;j++)
            if(array[j]>array[j+1]){
                array[j]+=array[j+1];
                array[j+1]=array[j]-array[j+1];
                array[j]-=array[j+1];
            }
     }
 }
public static void main(String args[])
{
    BubbleSort ob = new BubbleSort();
    int array[]=new int[4];
    ob.inputArray(array,4);
    ob.bubbleSort(array,4);
    ob.printArray(array,4);
}
}
