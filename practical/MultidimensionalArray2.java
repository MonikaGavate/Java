package monika;

public class MultidimensionalArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] multidimensionalArray = { {1,2,3},{2,3,4}, {3,4,5} };
	     
	      for(int i = 0 ; i < 3; i++){
	         //row
	         for(int j = 0 ; j < 3; j++){
	            System.out.print(multidimensionalArray[i][j] + " ");
	         }
	         System.out.println();
	      }
	}

}
