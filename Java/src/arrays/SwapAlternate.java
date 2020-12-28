package arrays;

public class SwapAlternate {

	public static void printArray(int[] oArray) {
		for(int i =0;i<oArray.length; i++) {
			System.out.print(oArray[i] + " ");
		}
	}
	
	public static int[] swap(int[] input) {
		
		for(int i=1;i<input.length; i+=2) {
			int temp = input[i-1];
			input[i-1] = input[i];
			input[i] = temp;
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] arr = {9,3,6,12};
		printArray(arr);
		System.out.println();
		int[] output = swap(arr);
		printArray(output);
	}
}