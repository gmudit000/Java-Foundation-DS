package search_sort;

public class Q1_PushZerosToEnd {
	public static void printArray(int[] arr) {
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void pushzero(int[] arr) {
		int n = arr.length;
		int k = 0;
		for(int i = 0; i< n ; i++) {
			if(arr[i] != 0) {
				arr[k] = arr[i];
				k++;
			}	
		}
		while(k<n) {
			arr[k] = 0;
			k++;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {2,6,0,0,1,9,0,8,0};
		printArray(arr);
		System.out.println();
		pushzero(arr);
		printArray(arr);
		
	}

}
