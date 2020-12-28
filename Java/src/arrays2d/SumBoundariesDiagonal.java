package arrays2d;

public class SumBoundariesDiagonal {

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3},
				{4, 5, 6},
				{7 ,8, 9}};
		int N = arr.length;
		int sum = 0;
		for (int i = 0; i < N; i++) { 
            for (int j = 0; j < N; j++) { 
      
                // Condition for diagonal elements 
                if (i == j || (i + j) == N - 1) { 
                    sum += arr[i][j]; 
                } 
      
                // Condition for Boundary elements 
                else if (i == 0 || j == 0 || i == N - 1|| j == N - 1) { 
                    sum += arr[i][j]; 
                } 
			}
		}
		
		
		System.out.println(sum);
	}

}