package monika;

import java.util.Arrays;
import java.util.Collections;

public class ExamArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] array = {23,78, 4, 6, 18, 16, 6, 110, 20,5,15};     
		Arrays.sort(array, Collections.reverseOrder());   
		System.out.println("Array elements in descending order: " +Arrays.toString(array));
	}
	}


