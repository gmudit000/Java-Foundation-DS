package arrays2d;

public class LargestRowColumn {

	public static void main(String[] args) {
		int[][] mat = {{3,6,9}, 
						{1,4,7} ,
						{2, 8 ,9,}};
		int rows = mat.length;
        int cols = mat[0].length;
		
        // largest column
        int largestcolumn = Integer.MIN_VALUE;
        int largestcolumnIndex = -1;
        
        for(int j = 0; j<cols; j++){
            int sum = 0;
            for(int i = 0; i<rows; i++){
                sum += mat[i][j];
            }
            if(sum > largestcolumn) {
	            largestcolumn = sum;
	            largestcolumnIndex = j;
            }
        }
        
        // largest row
        int largestrow = Integer.MIN_VALUE;
        int largestrowIndex = -1;
        
        for(int i = 0; i<rows; i++){
            int sum = 0;
            for(int j = 0; j<cols; j++){
                sum += mat[i][j];
            }
            if(sum > largestrow) {
	            largestrow = sum;
	            largestrowIndex = i;
            }
        }
        
        // compare row sum and column sum
        if(largestcolumn > largestrow) {
        	System.out.println("column" + " " +largestcolumnIndex + " " + largestcolumn);
        }else {
        	System.out.println("row" + " " + largestrowIndex + " " + largestrow);
        }
        
		
	}

}