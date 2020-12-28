package search_sort;

public class Q2_RotateArray {
	public static void printArray(int[] arr) {
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6};
		int arr1[] = new int[arr.length];
		int n = arr.length;
		int d = 3;
		for(int i =0; i<n; i++) {
			if(i<d) {
				arr1[n+i-d] = arr[i];
			}
			else {
				arr1[i-d] = arr[i];
			}
		}
		printArray(arr1);	
	}
}