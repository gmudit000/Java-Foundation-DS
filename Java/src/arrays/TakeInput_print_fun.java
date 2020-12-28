package arrays;
import java.util.Scanner;
public class TakeInput_print_fun {

	public static void printArray(int arr[]) {
		// printing value of array
		int size = arr.length;
		for(int i = 0; i< size ; i++) {
			System.out.println(arr[i]);
		}
	}
	public static int[] inputArray() {
		// update values in array
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();	
		int[] arr = new int[size];
		
		for(int i = 0; i< size ; i++) {
			System.out.println("Element at " + i + "th position");
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = inputArray();
		System.out.println();
		printArray(arr);
	}
}