package arrays2d;

import java.util.Scanner;

public class Functions_2d_array {

	public static void print2darray(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();  //  new line
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
		int[][] output = takeinputArray();
		print2darray(output);

	}

}
