package arrays;
import java.util.Scanner;
public class TakeInput_print {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		
		int[] arr = new int[size];
		
		// update values in array
		for(int i = 0; i< size ; i++) {
			System.out.println("Element at " + i + "th position");
			arr[i] = s.nextInt();
		}
		
		// printing value of array
		for(int i = 0; i< size ; i++) {
			System.out.println(arr[i]);
		}
		
	}

}