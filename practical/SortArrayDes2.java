package monika;
import java.util.Arrays;
import java.util.Collections;
public class SortArrayDes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] array = {"Mango","apple","grapes","papaya","pineapple","banana","orange"};   
		// sorts array[] in descending order   
		Arrays.sort(array, Collections.reverseOrder());   
		System.out.println("Array elements in descending order: " +Arrays.toString(array));
	}

}
