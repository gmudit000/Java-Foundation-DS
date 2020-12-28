package arrays;
import java.util.Scanner;

public class FindLargestNum {
	
	public static int largestNum(int[] arr) {
		int largest = Integer.MIN_VALUE;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] arr = new int[size];
		
		// taking input here or create a input function
		for(int i = 0; i<size; i++) {
			arr[i] = s.nextInt();
		}
		
		int largest = largestNum(arr);
		System.out.println("largest is: " + largest);
	}
}