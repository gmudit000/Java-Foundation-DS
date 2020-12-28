package function;

public class NonPrimitiveWithFunction {

	public static void printArray(int[] arr) {
//		System.out.println(arr);
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int[] incrementArray(int[] input) {
		// try without this line - 14 and see output and flow
		input = new int[7];							// new - new memory allocation
//		System.out.println(input);
		for(int i = 0; i<input.length;i++) {
			input[i] = input[i] + 1;
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		arr = incrementArray(arr);
//		System.out.println(arr);
		printArray(arr);
	}
}