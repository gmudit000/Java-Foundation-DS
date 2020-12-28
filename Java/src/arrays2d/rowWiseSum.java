package arrays2d;

import java.util.Scanner;

public class rowWiseSum {
	
	public static void rowWWWiseSum(int[][] mat) {
        
		if(mat.length == 0) {
			return;
		}
		int rows = mat.length;
        int cols = mat[0].length;
        
        for(int i = 0; i<rows; i++){
            int sum = 0;
            for(int j = 0; j<cols; j++){
                sum += mat[i][j];
            }
            System.out.print(sum + " ");
        }
	}

	
	public static int[][] takeinputArray(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter rows and cols");
		int rows = s.nextInt();
		int cols = s.nextInt();
		
		//declare 2d array
		int[][] input= new int[rows][cols];
		
		System.out.println("Enter elements row wise");
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols ; j++) {
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[][] ans = takeinputArray();
		rowWWWiseSum(ans);
	}

}
