
public class ArraySort {
 void sortAscending() {
		
		int a[]={5,3,8,9,6,1,44,0,10};
		System.out.print("sort the array elemennt in Ascending order:");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
			System.out.print(a[i]+" ");
		}
		System.out.println();	
 }
void sortDescending() {
	
		int a[]={5,3,8,9,6,1,44,0,10};
		System.out.print("sort the array element in Descending order:");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
			System.out.print(a[i]+" ");
		}
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySort a=new ArraySort();
	   a.sortAscending();	
	   a.sortDescending();
	}
 }

