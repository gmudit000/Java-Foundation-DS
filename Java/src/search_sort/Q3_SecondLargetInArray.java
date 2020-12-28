package search_sort;

public class Q3_SecondLargetInArray {
	
	public static int secondLarget(int[] arr) {
		int n = arr.length;
		// CASE - 1
		if( n<=1) {
			return Integer.MIN_VALUE;
		}
		// CASE - 2
//		for(int i = 0; i< n-1 ;i++) {
//			if(arr[i] == arr[i+1]) {
//				return Integer.MIN_VALUE;
//			}
//		}
		
		int maxElement = Integer.MIN_VALUE;
		
		for(int i = 0; i<n; i++) {
			if(maxElement < arr[i]) {
				maxElement = arr[i];
			}
		}
		return maxElement;
	}

	public static void Largest(int[] arr) {
		int n = arr.length;
		int maxElement = Integer.MIN_VALUE;
		int maxIndex = 0;
		
		for(int i = 0; i<n; i++) {
			if(maxElement < arr[i]) {
				maxElement = arr[i];
				maxIndex = i;
			}
		}
		arr[maxIndex] = 0;
	}
	
	public static void main(String[] args) {
		int[] arr = {6,6};
		Largest(arr);
		int ans = secondLarget(arr);
		System.out.println(ans);
	}

}
