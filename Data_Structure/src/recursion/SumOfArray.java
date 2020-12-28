package recursion;

public class SumOfArray {

	public static int sum(int[] arr) {
		// if length of array is 0
		if(arr.length == 0) {
			return 0;
		}
		if(arr.length == 1) {
			return arr[0];
		}
		
		int[] smallA = new int[arr.length-1];
		for(int i = 1; i < arr.length ; i++) {
			smallA[i-1] = arr[i];
		}
		
		int smalloutput = sum(smallA);
		int output = arr[0] + smalloutput;
		return output;
	}
	
	public static void main(String[] args) {
		int[] arr = {4,2,1};
		System.out.println(sum(arr));
	}

}
