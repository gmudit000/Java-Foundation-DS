package arrays;

// Approach - 2 
public class ArrangeNumArray2 {

		public static void printArray(int[] oArray) {
			for(int i =0;i<oArray.length; i++) {
				System.out.print(oArray[i] + " ");
			}
		}
		
		public static int[] arrangeArray(int[] input, int n) {
		
		//1 half - odd num
		int end = (n-1)/2;
		for(int i = 0, val=1; i<=end; i++) {
			input[i] = val;
			val += 2;
		}
		
		//2nd half - even num
		int start = (n-1)/2 + 1;
		int valStart;
		if(n%2==0) {
			valStart = n;
		}else {
			valStart = n-1;
		}
		
		for(int i = start;i<n ;i++) {
				
				input[i] = valStart;
				valStart-=2;
		}
		return input;
		
	}
	
	public static void main(String[] args) {
		//int[] arr = {1,3,5,4,2};
		int[] arr = new int[5];
		int n = arr.length;
		int[] output = arrangeArray(arr, n);
		printArray(output);
	}

}