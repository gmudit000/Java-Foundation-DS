package arrays2d;
import java.util.Scanner;
public class Input_print2darray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter rows and cols");
		int rows = s.nextInt();
		int cols = s.nextInt();
		
		//declare 2d array
		int[][] arr= new int[rows][cols];
		
		System.out.println("Enter elements row wise");
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols ; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		
		// printing values
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();  //  new line
		}
		
	}

}
