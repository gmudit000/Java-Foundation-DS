package test2_arrays;

public class PrintArray2d {
	public static void main(String[] args) {
		int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
		int rows = input.length;
	    int cols = input[0].length;
	    int z = 0;
	    for(int i = 0;i<rows; i++){
	        int p = 0;
	        while(p < rows - z){
	            for(int j = 0; j<cols ; j++){
	                System.out.print(input[i][j] + " ");
	            }
	            p++;
		        System.out.println();

	        }
	        z++;
	    }
	}
	

}
