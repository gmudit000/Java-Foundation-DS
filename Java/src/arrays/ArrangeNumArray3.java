package arrays;
import java.util.Scanner;
// Approach 3
public class ArrangeNumArray3 {
	
	public static void printArray(int[] arr) {
		for(int p =0; p<arr.length; p++) {
			System.out.println(arr[p]);
		}
	}
	
	// corner case : start == end
	public static int[] ArrangeArray(int[] input, int n) {
		
		int start = 0;   	// start index
		int end = n-1;	    // end index
		int val = 1;
		while(start <= end) {
			if(val%2 == 1) {		// for odd val
				input[start] = val;
				start++;
			}else {					// for even val
				input[end] = val;
				end--;	
			}
			val++;
		}
		return input;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		int[] in = ArrangeArray(arr, n);
		printArray(in);
	}
}