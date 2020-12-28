package search_sort;

public class Q3_SecondLargetInArray2 {
	
	public static int secondLarget(int[] arr) {
		int n = arr.length;
		// CASE - 1/////////////////////////
		if( n<=1) {
			return Integer.MIN_VALUE;
		}
		///////////////////////////////////
		
		int Largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int i = 0; i<n; i++) {
			if(Largest < arr[i]) {
				secondLargest = Largest;
				Largest = arr[i];
			}
			else{
				if(secondLargest < arr[i] && Largest!=arr[i]) {
					secondLargest = arr[i];
				}
			}
			
		}
		return secondLargest;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,2,2,2,2};
		int ans = secondLarget(arr);
		System.out.println(ans);
	}
}