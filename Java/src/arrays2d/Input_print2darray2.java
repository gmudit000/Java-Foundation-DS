package arrays2d;
import java.util.Scanner;
public class Input_print2darray2 {
	
	
	// assigning And printing elements cols wise
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter rows and cols");
		int rows = s.nextInt();
		int cols = s.nextInt();
		
		//declare 2d array
		int[][] arr= new int[rows][cols];
		
		System.out.println("Enter elements col wise");
		for(int i = 0; i<cols; i++) {
			for(int j = 0; j<rows ; j++) {
				arr[j][i] = s.nextInt();
			}
		}
		
		// printing values
		for(int i = 0; i<cols; i++) {
			for(int j = 0; j<rows ; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();  //  new line
		}
	}

}
